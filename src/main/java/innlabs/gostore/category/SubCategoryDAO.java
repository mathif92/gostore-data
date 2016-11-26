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
public interface SubCategoryDAO extends JpaRepository<SubCategory, Long> {

    /**
     * This method will find a SubCategory instance in the database by its name.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    @Query("SELECT sc FROM SubCategory sc where sc.name = :subCategoryName")
    public List<SubCategory> findByName(@Param(value = "subCategoryName") String subCategoryName);

    /**
     * This method will find all the Products related to the current SubCategory in the database by its Id.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    @Query("SELECT sc.products FROM SubCategory sc where sc.categoryId = :subCategoryId")
    public List<SubCategory> findProductsBySubCategoryId(@Param(value = "subCategoryId") Long subCategoryId);

}
