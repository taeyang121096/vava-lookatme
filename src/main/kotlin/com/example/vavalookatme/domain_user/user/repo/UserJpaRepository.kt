package com.example.vavalookatme.domain_user.user.repo

import com.example.vavalookatme.domain_user.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserJpaRepository : JpaRepository<User, Long>, UserQueryRepository{
}
