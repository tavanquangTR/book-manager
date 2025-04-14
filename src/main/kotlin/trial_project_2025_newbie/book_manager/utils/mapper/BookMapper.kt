package trial_project_2025_newbie.book_manager.utils.mapper

import trial_project_2025_newbie.book_manager.dto.BookDTO
import trial_project_2025_newbie.book_manager.entity.Book

class BookMapper : Mapper<BookDTO,Book> {

    override fun fromEntity(entity: Book): BookDTO {
        return BookDTO(
            entity.id,
            entity.name,
            entity.price,
            entity.author,
            entity.description
        )
    }

    override fun toEntity(domain: BookDTO): Book {
        return Book(
            domain.id,
            domain.name,
            domain.price,
            domain.author,
            domain.description,

        )
    }

}