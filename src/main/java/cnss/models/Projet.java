package cnss.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projet {
	@Id
	private long id;
	private String nom_projet;
	
	@ManyToMany(mappedBy="projets")
	private List<Employe> employes;
	


}
