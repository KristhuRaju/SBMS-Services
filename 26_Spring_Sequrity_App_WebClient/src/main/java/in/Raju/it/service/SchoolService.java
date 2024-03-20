package in.Raju.it.service;

import in.Raju.it.model.School;

public interface SchoolService {

	School saveSchool(School school);
	
	School getBySid(Integer sid);
	
}
