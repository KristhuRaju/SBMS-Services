package in.Raju.it.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.Raju.it.entity.Iamage;

@Service
public interface ImageService {

	public Iamage create(Iamage iamage);

	public List<Iamage> viewAll();

	public Iamage viewById(long id);

}
