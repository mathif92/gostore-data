package innlabs.gostore.product;

import innlabs.gostore.category.Category;
import innlabs.gostore.category.SubCategory;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mathias on 23/11/16.
 */
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    private String name;

    private String description;

    private Integer quantityOnHand;

    private BigDecimal price;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "product_subcategory", joinColumns = {
            @JoinColumn(name = "product_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "category_id",
                    nullable = false, updatable = false) })
    private List<SubCategory> subCategories;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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

    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
