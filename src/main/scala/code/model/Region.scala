package code
package model

import net.liftweb._
import common._
import util._

case class Region(id: Int,cid: Int,seoUrl:String,name:String) extends Loggable {
  logger.info("model.Region case class with id="+id+" cid="+cid)
}

object Region extends Loggable {
  logger.info("model.Region obj start")
  
  def find(id: String): Box[Region] = {
    logger.info("model.Region:find(id="+id+":String)")
    val r = FakeModelData.getACountryRegionList().find(_.seoUrl==id)
    logger.info("model.Region:find found "+r.toString())
    r
  }

  def unapply(id: String): Option[Region] = {
    logger.info("model.Region:unapply(id="+id+":String) returns Option[Country]")
    find(id)
  }

  def unapply(o: Any): Option[(Int,Int,String,String)] = o match {
    case o: Region => { 
      logger.info("model.Region:unapply("+o.toString()+":Any) matched Some("+o.id+")") 
      Some(o.id,o.cid,o.seoUrl,o.name)
    }
    case _ => {
      logger.info("model.Region:unapply("+o.toString()+":Any) matched None") 
      None
    }
  } 

  logger.info("model.Region obj end")
}
