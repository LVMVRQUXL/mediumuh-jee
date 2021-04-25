package fr.esgi.jee.mediumuh.infrastructure.author

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : CrudRepository<AuthorEntity, String> {
}
