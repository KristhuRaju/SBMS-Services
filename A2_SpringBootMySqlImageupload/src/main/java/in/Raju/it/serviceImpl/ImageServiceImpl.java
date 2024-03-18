package in.Raju.it.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Raju.it.entity.Iamage;
import in.Raju.it.repository.IamageRepository;
import in.Raju.it.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private IamageRepository iamageRepository;

	@Override
	public Iamage create(Iamage iamage) {
		
		return iamageRepository.save(iamage);
	}

	@Override
	public List<Iamage> viewAll() {
		
		return (List<Iamage>)iamageRepository.findAll();
	}

	@Override
	public Iamage viewById(long id) {
	
		return iamageRepository.findById(id).get();
	}

}
