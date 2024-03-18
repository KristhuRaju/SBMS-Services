package in.Rajuit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Rajuit.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

}
