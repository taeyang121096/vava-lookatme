package com.example.vavalookatme.domain_user.user.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var name: String,

    @Column(unique = true, nullable = false)
    var email: String,

    @Column(nullable = false)
    var password: String,

    @Enumerated(EnumType.STRING)
    var gender: Gender,

    var birth: LocalDate,

    var phone: String,

    var active: Boolean = true,

    var joinDate: LocalDate = LocalDate.now(),

    var quitDate: LocalDate? = null,

    @Embedded
    var role: Role
)
