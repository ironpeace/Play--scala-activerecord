package controllers

import play.api._
import play.api.mvc._
import models._
import com.github.aselab.activerecord.dsl._

object Application extends Controller {
  
  def index = Action {
  	val users = User.all.toList
    Ok(views.html.index(users))
  }

  def find(name:String) = Action {
  	val users = User.where( u =>
  		u.name like name + "%"
  	).orderBy(u => u.age desc).toList
  	Ok(views.html.index(users))
  }

  def filter(age:Int) = Action {
  	val users = User.where( u =>
  		u.age.~ < age
  	).orderBy(u => u.age desc).toList
  	Ok(views.html.index(users))
  }

}