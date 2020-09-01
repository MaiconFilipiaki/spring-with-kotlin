package com.mdfilipiaki.kotlinspring.repositories

import com.mdfilipiaki.kotlinspring.models.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Int> {}