package demo

//import slick.backend.DatabaseConfig
//import slick.basic
//import slick.driver.JdbcProfile
import slick.jdbc.JdbcProfile
import slick.basic.DatabaseConfig

trait Db {
//    def withDB(test:DatabaseConfig[JdbcProfile])
    val config: DatabaseConfig[JdbcProfile]
    val db: JdbcProfile#Backend#Database = config.db

}
