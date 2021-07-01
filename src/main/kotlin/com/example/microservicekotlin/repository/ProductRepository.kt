package com.example.microservicekotlin.repository

import com.example.microservicekotlin.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product,Int> {
    fun findByName(name:String):Product
}