package demo

import netscape.security.UserTarget
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.meta.MBestRowIdentifierColumn.Scope.Session



object DAO {


  trait DBConfiguration {

    lazy val config = DatabaseConfig.forConfig[JdbcProfile]("pg-database")
  }

  class UsersRepository(val config: DatabaseConfig[JdbcProfile])
    extends Db with UserTable {
    import config.driver.api._
    import scala.concurrent.ExecutionContext.Implicits.global
//    override def getUser(userId: UserId): DBResult[UserRow] = {
//      query
//        .filter(_.id === userId)
//        .result
//        .toDBResult
//    }toDBResult

  }


//  trait UserTable {
//    this: Db =>
//
//    import config.driver.api._
//
//    class Users(tag: Tag) extends Table[(Int, String)](tag, "USERS") {
//       def id = column[Int]("id")
//
//       def username = column[String]("username")
//
//       def * = (id, username)
//
//       // Select
//       //    Selectdef * = (id.?, username.?) == (id.unapply)
//       val Users = TableQuery[Users]
//     }
//
//  }
  def main(args: Array[String]): Unit = {


    val users  = new UsersRepository(val config:DatabaseConfig[JdbcProfile]) {}

    List(users).foreach(row => print(row))
  }
}