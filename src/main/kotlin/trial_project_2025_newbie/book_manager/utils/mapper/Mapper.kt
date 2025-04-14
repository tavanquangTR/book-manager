package trial_project_2025_newbie.book_manager.utils.mapper



interface Mapper<D,E> {
    fun fromEntity(entity: E):D
    fun toEntity(domain:D):E
}