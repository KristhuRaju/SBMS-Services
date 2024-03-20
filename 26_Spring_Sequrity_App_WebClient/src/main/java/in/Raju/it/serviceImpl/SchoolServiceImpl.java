package in.Raju.it.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Raju.it.model.School;
import in.Raju.it.repository.SchoolRepository;
import in.Raju.it.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public School saveSchool(School school) {
		
		return schoolRepository.save(school);
	}

	@Override
	public School getBySid(Integer sid) {
		
		return schoolRepository.findById(sid).get();
	}

}
