package fr.esgi.jee.mediumuh.infrastructure.author

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IAuthorRepository : CrudRepository<AuthorEntity, UUID>
