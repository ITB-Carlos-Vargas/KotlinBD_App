import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object Database {
    private const val URL = "jdbc:postgresql://localhost:5432/KotlinJava"
    private const val USER = "hr"
    private const val PASSWORD = "hr"

    fun getConnection(): Connection? {
        return try {
            DriverManager.getConnection(URL, USER, PASSWORD)
        } catch (e: SQLException) {
            println("Error al conectar: ${e.message}")
            null
        }
    }
}