package fr.esgi.jee.mediumuh.infrastructure

import org.springframework.stereotype.Repository
import java.util.ArrayList

@Repository
class AuthorRepository {
    fun findAll(): List<AuthorEntity> = ArrayList<AuthorEntity>()
}
