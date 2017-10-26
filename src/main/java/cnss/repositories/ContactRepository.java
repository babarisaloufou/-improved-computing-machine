package cnss.repositories;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cnss.models.Contact;



public interface ContactRepository extends CrudRepository<Contact, Integer> {
	
	// 	Exemple de requête personnalisée et retourner un flux
   /* @Query("select c from Contact c where c.contacts_email = :email")
    Stream<Contact> findByEmailReturnStream(@Param("email") String email);*/

}
