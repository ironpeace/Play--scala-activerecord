package models

import com.github.aselab.activerecord._
import java.sql.Timestamp


case class User(
  var name: String,
  var age: Int,
  var createdat:Timestamp
) extends ActiveRecord{
	def this() = this("", 0, null)
}

object User extends ActiveRecordCompanion[User]