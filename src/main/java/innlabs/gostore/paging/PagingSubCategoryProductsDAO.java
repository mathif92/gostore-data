package innlabs.gostore.paging;

import innlabs.gostore.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mathias on 24/11/16.
 */
@Transactional
public interface PagingSubCategoryProductsDAO extends PagingAndSortingRepository<Product, Long> {

    @Query( "select sc.products from SubCategory sc where sc.categoryId = :subCategoryId" )
    Page<Product> findAllSubCategoryProducts(Pageable pageable, @Param(value = "subCategoryId") Long subCategoryId);

}
