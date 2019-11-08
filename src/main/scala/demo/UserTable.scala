package demo

trait UserTable {
  this: Db =>

  import config.driver.api._

  class Users(tag: Tag) extends Table[(Int, String)](tag, "USERS") {
    def id = column[Int]("id")

    def username = column[String]("username")

    def * = (id, username)

    // Select
    //    Selectdef * = (id.?, username.?) == (id.unapply)
    val Users = TableQuery[Users]
  }

}