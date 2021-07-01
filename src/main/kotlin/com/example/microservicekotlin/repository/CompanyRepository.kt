package com.example.microservicekotlin.repository

import com.example.microservicekotlin.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<Company,Int> {
}