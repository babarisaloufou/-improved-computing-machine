package cnss.models;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	private long id;
	private String name;
	private String lieu;
	@OneToMany(mappedBy="departement")
	private Collection<Employe> employes;

}
