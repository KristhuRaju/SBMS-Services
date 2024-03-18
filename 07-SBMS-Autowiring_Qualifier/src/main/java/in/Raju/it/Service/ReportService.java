package in.Raju.it.Service;

import org.springframework.stereotype.Service;

import in.Raju.it.Dao.ReportDao;
@Service
public class ReportService {
	
private ReportDao reportDao;

public void sertReportDao(ReportDao reportDao) {
	System.out.println("Set Repo Dao() :: Method");
	this.reportDao=reportDao;
}
public void generateReport() {
	reportDao.findData();
	System.out.println("Generating Daoo report ");
}
}
