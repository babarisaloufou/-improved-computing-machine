package cnss.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cnss.models.Employe;
import cnss.services.EmployeService;

@Controller
public class EmployeController {
	private static final Logger logger=LoggerFactory.getLogger(EmployeController.class);
	
	@Autowired
	private EmployeService employeService;
	
	@RequestMapping("/listes")
	public String listeEmploye(Model model) {
		logger.info("listeEmploye() pour obtenir la liste des employés");
		List<Employe> listeEmploye = employeService.findAll();
		logger.info("le premier employé: "+ listeEmploye.get(0).toString());
		model.addAttribute("employes", listeEmploye);
		
		return  "displayliste";
				
	}
	
	@GetMapping("/form")
	public String employeForm(Model model) {
		model.addAttribute("employe", new Employe());
		
		return  "formulaire";
				
	}
	@PostMapping("/enregistrer")
	public ModelAndView employeSubmit(@ModelAttribute Employe employe) {
		employeService.save(employe);
	    
		return  new ModelAndView("redirect:/listes");
				
	}


}
