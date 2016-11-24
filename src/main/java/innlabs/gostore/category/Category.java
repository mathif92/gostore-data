package innlabs.gostore.category;

import innlabs.gostore.product.Product;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mathias on 23/11/16.
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="categoryType",
        discriminatorType= DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryId;

    private String name;

    private String description;

    @OneToMany
    private List<Product> products;


    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
