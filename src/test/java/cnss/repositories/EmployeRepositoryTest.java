package cnss.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cnss.models.Employe;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeRepositoryTest {
	
	@Autowired
	private EmployeRepository employeRepository;
	@Test
	public void testSave() {
		Employe employe = new Employe();
		employe.setNom("BABARI");
		Employe employeResultat= employeRepository.save(employe);
		assertEquals("BABAR", employeResultat.getNom());
		/*fail("Not yet implemented");*/
	}
	@Test
	public void testCount() {
		Long number=employeRepository.count();
		assertEquals(4, number.longValue());
		/*fail("Not yet implemented");*/
	}
	
	@Test
	public void testFindByNom() {
		List<Employe> listeEmploye=employeRepository.findByNom("BABARI");
		assertEquals("BABARI",listeEmploye.get(0).getNom() );
		/*fail("Not yet implemented");*/
	}

}
