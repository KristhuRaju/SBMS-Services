package in.Raju.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Raju.it.entity.Instructor;
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

	Instructor save(Long eid);

}
