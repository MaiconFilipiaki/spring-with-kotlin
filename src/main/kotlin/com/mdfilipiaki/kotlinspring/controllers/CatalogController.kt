package com.mdfilipiaki.kotlinspring.controllers

import com.mdfilipiaki.kotlinspring.http.inputs.ProductInput
import com.mdfilipiaki.kotlinspring.http.resources.ProductResource
import com.mdfilipiaki.kotlinspring.http.mappers.ProductMapper
import com.mdfilipiaki.kotlinspring.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CatalogController(private val productService: ProductService) {

    @PostMapping("/create")
    fun index(@RequestBody productInput: ProductInput): ResponseEntity<ProductResource> {
        return ResponseEntity.ok(
                ProductMapper().toResource(
                        productService.create(
                                ProductMapper().toModel(productInput)
                        )
                )
        );
    }

    @GetMapping("/all")
    fun listAll(): ResponseEntity<List<ProductResource>> {
        return ResponseEntity.ok(
                ProductMapper().toResourceList(
                        productService.getAll()
                )
        );
    }

}