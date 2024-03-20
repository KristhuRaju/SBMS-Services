package in.Raju.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	@Bean
	public InMemoryUserDetailsManager inMemoryUsers() {
		UserDetails rajuuser= User.withDefaultPasswordEncoder()
								  .username("rajuu")
								  .password("raju@1234")
								  .authorities("ADMIN")
								  .build();
		UserDetails ashok= User.withDefaultPasswordEncoder()
							   .username("Ashok")
							   .password("ashok")
								.authorities("UserServer")
								.build();
		return  new InMemoryUserDetailsManager(rajuuser,ashok);
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/contact", "/swagger-ui.html").permitAll()
						.anyRequest().authenticated()
			)
				.httpBasic();
//				.formLogin();
		return http.build();
	}

	
}
