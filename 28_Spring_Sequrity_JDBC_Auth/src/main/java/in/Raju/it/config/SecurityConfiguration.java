package in.Raju.it.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	private static final String ADMIN="ADMIN";
	private static final String USER="USER";
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	public AuthenticationManagerBuilder authManager(AuthenticationManagerBuilder auth)throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(new BCryptPasswordEncoder())
			.usersByUsernameQuery("select username,password,enabled from users where username=?")
			.authoritiesByUsernameQuery("select username,authority from authorities where username=");
		return auth;
	}
	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
			
		http.authorizeHttpRequests( (req) -> req
				.requestMatchers("/admin").hasRole(ADMIN)
				.requestMatchers("/user").hasAnyRole(ADMIN,USER)
				.requestMatchers("/").permitAll()
				.anyRequest().authenticated()
		).formLogin();
		
		return http.build();
	}
}
