package com.example.vavalookatme.domain_user.user.repo

import com.example.vavalookatme.domain_user.user.domain.QUser.*
import com.example.vavalookatme.domain_user.user.domain.User
import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository

@Repository
class UserQueryRepositoryImpl(
    private val em: EntityManager
) : UserQueryRepository {

    private val queryFactory: JPAQueryFactory = JPAQueryFactory(em)

    override fun findActiveUsersByName(name: String): List<User> {
        return queryFactory
            .selectFrom(user)
            .where(user.name.eq(name).and(user.isActive.isTrue))
            .fetch()
    }


}
