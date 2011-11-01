package code
package model

import lib.util._


object FakeModelData {
  
  def p1List():List[P1]=List(P1(1),P1(2),P1(3))
  def p2List(p1:P1):List[P2]=List(P2(1),P2(2),P2(3))

  def getCountryList():List[Country] = List(
      Country(1,SEOTransform.toSEOFriendly("UNITED KINGDOM"),"United Kingdom"),
      Country(2,SEOTransform.toSEOFriendly("UNITED STATES"),"United States"),
      Country(3,SEOTransform.toSEOFriendly("COSTA RICA"),"Costa Rica"),
      Country(4,SEOTransform.toSEOFriendly("MYANMAR (Burma)"),"Myanmar (Burma)"),
      Country(5,SEOTransform.toSEOFriendly("PAPUA NEW GUINEA"),"Papua New Guinea"),
      Country(6,SEOTransform.toSEOFriendly("PUERTO RICO"),"Puerto Rico"))

  def getACountryRegionList():List[Region] = List(
      Region(1,1,SEOTransform.toSEOFriendly("London"),"London"),
      Region(2,1,SEOTransform.toSEOFriendly("Scotland"),"Scotland"),
      Region(3,1,SEOTransform.toSEOFriendly("Northern Ireland"),"Northern Ireland"),
      Region(4,2,SEOTransform.toSEOFriendly("New York"),"New York"),
      Region(5,2,SEOTransform.toSEOFriendly("Rhode Island"),"Rhode Island"),
      Region(6,2,SEOTransform.toSEOFriendly("San Francisco Bay Area"),"San Francisco Bay Area"),
      Region(7,3,SEOTransform.toSEOFriendly("Southern Pacific Zone"),"Southern Pacific Zone"),
      Region(8,3,SEOTransform.toSEOFriendly("Central Zone"),"Central Zone"),
      Region(9,3,SEOTransform.toSEOFriendly("Northern Zone and Arenal"),"Northern Zone and Arenal"),
      Region(10,4,SEOTransform.toSEOFriendly("Mandalay Region‎"),"Mandalay Region‎"),
      Region(11,4,SEOTransform.toSEOFriendly("Ayeyarwady Region‎"),"Ayeyarwady Region‎"),
      Region(12,4,SEOTransform.toSEOFriendly("Sagaing Region‎"),"Sagaing Region‎"),
      Region(13,5,SEOTransform.toSEOFriendly("Highlands Region"),"Highlands Region"),
      Region(14,5,SEOTransform.toSEOFriendly("Islands Region"),"Islands Region"),
      Region(15,5,SEOTransform.toSEOFriendly("Papua Region"),"Papua Region"),
      Region(16,6,SEOTransform.toSEOFriendly("6 Region 1"),"Region 1"),
      Region(17,6,SEOTransform.toSEOFriendly("6 Region 2"),"Region 2"),
      Region(18,6,SEOTransform.toSEOFriendly("6 Region 3"),"Region 3")      
      ) 
  
}