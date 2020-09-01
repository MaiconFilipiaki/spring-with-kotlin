package com.mdfilipiaki.kotlinspring.service

import com.mdfilipiaki.kotlinspring.models.Product
import com.mdfilipiaki.kotlinspring.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun create(product: Product): Product = productRepository.save(product);

    fun getAll(): List<Product> = productRepository.findAll()

}