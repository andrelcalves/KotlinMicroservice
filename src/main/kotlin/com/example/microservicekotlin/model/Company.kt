package com.example.microservicekotlin.model

import javax.persistence.*

@Entity
@Table(name = "company")
data class Company(
    @Id
    @GeneratedValue
    @Column(name = "id_company")
    var id:Int = 0,

    @Column(name = "name")
    var name:String = "",

    @Column(name= "address")
    var address:String = "",

    @OneToMany(mappedBy = "company", cascade= [CascadeType.ALL], fetch = FetchType.LAZY)
    var products: MutableSet<Product> = mutableSetOf()
    )
