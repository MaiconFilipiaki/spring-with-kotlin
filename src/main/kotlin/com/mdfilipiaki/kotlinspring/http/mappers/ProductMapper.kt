package com.mdfilipiaki.kotlinspring.http.mappers

import com.mdfilipiaki.kotlinspring.models.Product
import com.mdfilipiaki.kotlinspring.http.inputs.ProductInput
import com.mdfilipiaki.kotlinspring.http.resources.ProductResource

class ProductMapper {

    fun toResource(product: Product): ProductResource =
            ProductResource(product.id, product.name, product.price)

    fun toResourceList(products: List<Product>): List<ProductResource> {
        return products.map{toResource(it)}
    }

    fun toModel(productInput: ProductInput) =
            Product(name = productInput.name, price = productInput.price)

}