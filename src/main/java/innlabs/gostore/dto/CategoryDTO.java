package innlabs.gostore.dto;

import innlabs.gostore.category.Category;

/**
 * Created by mathias on 24/11/16.
 */
public class CategoryDTO {

    public Long categoryId;
    public String name;
    private String description;
    public String imageUrl;

    public CategoryDTO(Category category) {
        this.categoryId = category.getCategoryId();
        this.name = category.getName();
        this.description = category.getDescription();
        this.imageUrl = category.getImageURL();
    }

}
