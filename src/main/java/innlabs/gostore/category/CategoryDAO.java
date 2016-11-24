package innlabs.gostore.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mathias on 23/11/16.
 */
@Transactional
@RepositoryRestResource
public interface CategoryDAO extends JpaRepository<Category, Long> {

    /**
     * This method will find a Category instance in the database by its name.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    @Query("SELECT c FROM Category c where c.name = :categoryName")
    public List<Category> findByName(@Param(value="categoryName") String categoryName);

}
