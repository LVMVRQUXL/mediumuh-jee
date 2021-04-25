package fr.esgi.jee.mediumuh.domain.author

import fr.esgi.jee.mediumuh.infrastructure.AuthorRepository
import org.springframework.stereotype.Service

@Service
class AuthorService(val authorRepository: AuthorRepository) {
    fun findAll(): List<Author> {
        val entities = authorRepository.findAll()
        return entities.map { entity -> AuthorMapper().from(entity) }
    }
}