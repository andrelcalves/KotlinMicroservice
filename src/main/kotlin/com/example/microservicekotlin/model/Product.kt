package com.example.microservicekotlin.model

import javax.persistence.*

@Entity
@Table(name = "product")
data class Product (
    @Id
    @GeneratedValue
    @Column(name = "id_product")
    var id:Int = 0,

    @Column(name = "name")
    var name:String = "",

    @ManyToOne
    @JoinColumn(name = "id_company")
    var company: Company
)