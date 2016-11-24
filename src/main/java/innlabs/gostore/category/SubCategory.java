package innlabs.gostore.category;

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
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
