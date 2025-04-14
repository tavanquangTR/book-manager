package trial_project_2025_newbie.book_manager.service

import trial_project_2025_newbie.book_manager.dto.BookDTO

interface BookService {
    fun createBook(bookDTO:BookDTO):BookDTO
}