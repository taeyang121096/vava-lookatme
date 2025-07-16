package com.example.vavalookatme.domain_user.user.domain

import jakarta.persistence.Embeddable

@Embeddable
data class Role(
    val role: String
)

