package innlabs.gostore.category;

import com.google.gson.annotations.Expose;
import innlabs.gostore.product.Product;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mathias on 23/11/16.
 */
@Entity
@DiscriminatorValue("1")
public class SubCategory extends Category {

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "product_subcategory", joinColumns = {
            @JoinColumn(name = "category_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "product_id",
                    nullable = false, updatable = false) })
    @Expose(serialize = false, deserialize = false)
    private List<Product> productList;

    @ManyToOne
    private Category parentCategory;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }
}
