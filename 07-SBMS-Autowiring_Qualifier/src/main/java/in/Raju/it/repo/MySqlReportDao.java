package in.Raju.it.repo;

import org.springframework.stereotype.Repository;

import in.Raju.it.Dao.ReportDao;
@Repository("Mysql")
public class MySqlReportDao implements ReportDao {

	public MySqlReportDao() {
		System.out.println("My Sql :: Constructors");
	}
	@Override
	public String findData() {
		System.out.println("Featching My sql Qulifier");
		return null;
	}

}
