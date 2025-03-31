

fun getDepartamento(departamentID: Int){
    val sql = "select * from departments d where department_id = 100"
    println("department_id - department_name - manager_id - location_id")
    Database.getConnection()?.use { conn ->
        conn.createStatement().use {
            val rs = it.executeQuery(sql)
            while (rs.next()) {
                println("${rs.getInt("department_id")} - " +
                        "${rs.getString("department_name")} - " +
                        "(${rs.getInt("manager_id")}) - " +
                        "${rs.getInt("location_id")}")
            }
        }
    }
}

fun getAlgo(){
    val sql = "SELECT * FROM products"
    Database.getConnection()?.use { conn ->
        conn.createStatement().use {
            val rs = it.executeQuery(sql)
            while (rs.next()) {
                println("${rs.getInt("prod_id")} - ${rs.getString("title")} ($${rs.getDouble("price")})")
            }
        }
    }
}

