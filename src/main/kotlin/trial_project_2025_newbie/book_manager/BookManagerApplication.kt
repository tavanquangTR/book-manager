package trial_project_2025_newbie.book_manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

@SpringBootApplication
class BookManagerApplication{
	@GetMapping
	fun sayHi() = "hello world"
}


fun main(args: Array<String>) {
	runApplication<BookManagerApplication>(*args)
}
