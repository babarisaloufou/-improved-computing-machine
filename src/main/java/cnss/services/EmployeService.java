package cnss.services;

import java.util.List;

import cnss.models.Employe;

public interface EmployeService {
	
	public List<Employe> findByNom(String nom);
	public List<Employe> findAll();
	public void save(Employe employe);
	

}
