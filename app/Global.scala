import play.api._
import com.github.aselab.activerecord._
import models._
import java.sql.Timestamp

object Global extends GlobalSettings {
	override def onStart(app: Application) {
		Tables.initialize

		if(User.all.toList.length == 0){
			User("Taro Yamada", 16, new Timestamp(System.currentTimeMillis())).save
			User("Jiro Suzuki", 19, new Timestamp(System.currentTimeMillis())).save
			User("Saburo Satoh", 20, new Timestamp(System.currentTimeMillis())).save
			User("Shiro Yoshida", 23, new Timestamp(System.currentTimeMillis())).save
			User("Goro Gotoh", 29, new Timestamp(System.currentTimeMillis())).save
			User("Rokuro Muguruma", 35, new Timestamp(System.currentTimeMillis())).save
			User("ShichiRo Nanasawa", 46, new Timestamp(System.currentTimeMillis())).save
		}

	}

	override def onStop(app: Application) {
		Tables.cleanup
	}
}