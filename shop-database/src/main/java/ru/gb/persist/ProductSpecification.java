package ru.gb.persist;

import org.springframework.data.jpa.domain.Specification;
import ru.gb.persist.model.Product;

public class ProductSpecification {

    public static Specification<Product> byCategory(long categoryId) {
        return (root, query, builder) -> builder.equal(root.get("category").get("id"), categoryId);
    }

    public static Specification<Product> byName(String pattern) {
        return (root, query, builder) -> builder.like(root.get("name"), "%" + pattern + "%");
    }

    public static Specification<Product> byBrand(Long brandId) {
        return (root, query, builder) -> builder.equal(root.get("brand").get("id"), brandId);
    }
}
