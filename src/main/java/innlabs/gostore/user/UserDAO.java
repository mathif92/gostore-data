package innlabs.gostore.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mathias on 13/11/16.
 */
@Transactional
@RepositoryRestResource
public interface UserDAO  extends JpaRepository<User, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    @Query("SELECT u FROM User u where u.mail = :mail")
    public List<User> findByMail(@Param(value="mail") String mail);

    /**
     * This method will find an User instance in the database by its userName.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    @Query("SELECT u FROM User u where u.userName = :userName")
    public List<User> findByUserName(@Param(value="userName") String userName);

}
