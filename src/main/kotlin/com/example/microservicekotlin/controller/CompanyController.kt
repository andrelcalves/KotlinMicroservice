package com.example.microservicekotlin.controller

import com.example.microservicekotlin.model.Company
import com.example.microservicekotlin.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CompanyController {

    @Autowired
    lateinit var companyRepository:CompanyRepository

    @PostMapping("/saveCompany")
    fun save(@RequestBody company:Company):String{
        companyRepository.save(company)
        return "Company Detail Saved"
    }

    @GetMapping("/getAll")
    fun getCompany():List<Company>{
        return companyRepository.findAll()
    }

    @GetMapping("/getCompany/{name}")
    fun getCompany(@PathVariable name:String):Company{
        return companyRepository.findByName(name)
    }

    @DeleteMapping("/deleteCompany/{id}")
    fun deleteCompany(@PathVariable id:Int):String{
        companyRepository.deleteById(id)
        return "Company Deleted"
    }
}