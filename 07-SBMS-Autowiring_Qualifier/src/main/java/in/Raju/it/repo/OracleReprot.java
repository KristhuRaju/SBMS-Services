package in.Raju.it.repo;

import org.springframework.stereotype.Repository;

import in.Raju.it.Dao.ReportDao;
@Repository("Oracle")
public class OracleReprot implements ReportDao{
	
	public OracleReprot() {
		System.out.println("OracleDaoImpl :: Consatrictr");
	}

	@Override
	public String findData() {
		System.out.println("Featching report Dao");
		return "ReportData";
	}

}
