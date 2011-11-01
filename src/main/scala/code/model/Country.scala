package code
package model

import net.liftweb._
import common._
import util._


case class Country (val id: Int,seoUrl:String,name:String) extends Loggable  {
  logger.debug("model.Country case class with id="+id)
}

object Country extends Loggable {
  logger.debug("model.Contry obj start")
  
  def find(id: String): Box[Country] = {
    logger.debug("model.Country object find id="+id)
    val c = FakeModelData.getCountryList().find(_.seoUrl==id)
    logger.debug("model.Country object find found ="+c.toString())
    c
  }

  def unapply(id: String): Option[Country] = {
    logger.debug("model.Country:unapply(id="+id+":String) returns Option[Country]")
    find(id)
  }

  def unapply(o: Any): Option[(Int,String,String)] = o match {
    case o: Country => {
      logger.debug("model.Country object unapply(o:Any) some o.id="+o.id)
      Some(o.id,o.seoUrl,o.name)
    }
    case _ => { 
      logger.debug("model.Country object unapply(o:Any) No match returning None")
      None
    }
  }  
 
  logger.debug("model.Contry obj end")
}


