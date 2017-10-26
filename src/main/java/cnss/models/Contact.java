package cnss.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;




/**
 * Contact entity.
 */
@Entity
@Table(name = "contacts")
public class Contact  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contacts_id")
	private Integer id;

	@Column(name = "contacts_nom")
	@NotNull(message = "Le nom ne peut pas être vide")
	@Size(min = 3, max = 150, message = "Le nom du contact peut comporter au minimum 3 et maximum 30 caractères")
	private String nom;

	@Column(name = "contacts_prenom")
	@NotNull(message = "Le prénom ne peut pas être vide")
	private String prenom;

	@Column(name = "contacts_sexe")
	@NotNull
	private String sexe;
	
	public Contact() {
		
	}

	public Contact(String nom, String prenom, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + "]";
	}	
	
	
	
	

}
