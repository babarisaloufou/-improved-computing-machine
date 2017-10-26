package cnss.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min=2, max=25)
	private String nom;
	
	@NotNull
	@Size(min=3, max=10)
	private String prenom;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Departement departement;
	@ManyToMany
	private List<Projet> projets;

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + "]";
	}


}
