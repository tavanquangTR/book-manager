package trial_project_2025_newbie.book_manager.service

import trial_project_2025_newbie.book_manager.dto.BookDTO
import trial_project_2025_newbie.book_manager.repository.BookRepository
import trial_project_2025_newbie.book_manager.utils.mapper.BookMapper

class BookServiceImpl(
    private  var bookRepository: BookRepository,
    private var bookMapper: BookMapper
    ) :BookService {
    override fun createBook(bookDTO: BookDTO):BookDTO {
        var book = bookMapper.toEntity(bookDTO)
       bookRepository.save(book)
        return bookMapper.fromEntity(book)
    }
}