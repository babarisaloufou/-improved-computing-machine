package cnss.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import cnss.models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
	public List<Employe> findByNom(String nom);


}
