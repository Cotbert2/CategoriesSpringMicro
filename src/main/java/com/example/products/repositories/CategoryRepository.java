package com.example.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.products.models.entities.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
