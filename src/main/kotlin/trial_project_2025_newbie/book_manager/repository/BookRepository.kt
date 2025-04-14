package trial_project_2025_newbie.book_manager.repository

import org.springframework.data.repository.CrudRepository
import trial_project_2025_newbie.book_manager.entity.Book

interface BookRepository : CrudRepository<Book,Int> {

}