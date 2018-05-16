package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cy.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
