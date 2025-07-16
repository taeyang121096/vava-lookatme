package com.example.vavalookatme.domain_user.user.service

import com.example.vavalookatme.domain_user.user.repo.UserJpaRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserJpaRepository
) {
}
