package cnss.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cnss.models.Employe;
import cnss.repositories.EmployeRepository;
import cnss.services.EmployeService;

@Service
@Transactional
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeRepository employeRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<Employe> findByNom(String nom) {
		return employeRepository.findByNom(nom);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employe> findAll() {
		return  employeRepository.findAll();
	}

	@Override
	@Transactional
	public void save(Employe employe) {
		// TODO Auto-generated method stub
	employeRepository.save(employe)	;
	}

}
