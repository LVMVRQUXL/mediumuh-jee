package fr.esgi.jee.mediumuh.domain.author

import fr.esgi.jee.mediumuh.infrastructure.author.AuthorRepository
import org.springframework.stereotype.Service

@Service
data class AuthorService(val authorRepository: IAuthorRepository) {
    fun findAll(): List<Author> {
        val entities = authorRepository.findAll()
        return entities.map { entity -> AuthorMapper().from(entity) }
    }
}