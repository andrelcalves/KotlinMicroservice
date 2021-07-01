package com.example.microservicekotlin.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue

@Entity
@Table
data class Company(@Id @GeneratedValue val id:Int = 0,
                   val name:String = "",
                   val address:String = "")
