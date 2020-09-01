package com.mdfilipiaki.kotlinspring.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PRODUCTS")
class Product(
        @Id @GeneratedValue var id: Int = 0,
        var name: String = "",
        var price: Double = 0.0
)