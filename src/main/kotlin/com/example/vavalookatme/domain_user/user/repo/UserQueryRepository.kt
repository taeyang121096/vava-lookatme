package com.example.vavalookatme.domain_user.user.repo

import com.example.vavalookatme.domain_user.user.domain.User

interface UserQueryRepository {

    fun findActiveUsersByName(name: String): List<User>
}
