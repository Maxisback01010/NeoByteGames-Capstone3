package org.yearup.service;

import org.springframework.stereotype.Service;
import org.yearup.models.Category;
import org.yearup.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService
{
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories()
    {
        // get all categories
        return null;
    }

    public Category getById(int categoryId)
    {
        return categoryRepository
                .findById(categoryId)
                .orElseThrow(() -> new org.springframework.web.server.ResponseStatusException(
                        org.springframework.http.HttpStatus.NOT_FOUND,
                        "Category not found"
                )
                );
    }

    public Category create(Category category)
    {
        // create a new category
        category.setCategoryId(0);

        return categoryRepository.save(category);
    }

    public Category update(int categoryId, Category category)
    {
        Category existing = categoryRepository
                .findById(categoryId)
                .orElseThrow();

        existing.setName(category.getName());
        existing.setDescription(category.getDescription());

        return categoryRepository.save(existing);
    }

    public void delete(int categoryId)
    {
        categoryRepository.deleteById(categoryId);
        // delete category
    }
}
