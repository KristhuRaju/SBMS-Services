package in.Raju.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.Raju.it.entity.Iamage;
@Repository
public interface IamageRepository extends CrudRepository<Iamage, Long> {

}
