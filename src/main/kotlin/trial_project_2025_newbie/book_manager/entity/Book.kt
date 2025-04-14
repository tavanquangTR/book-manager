package trial_project_2025_newbie.book_manager.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Int,
    var name:String,
    var price :Int,
    var author:String,
    var description:String
)