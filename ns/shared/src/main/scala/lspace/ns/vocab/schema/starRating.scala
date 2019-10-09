package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object starRating extends PropertyDef(
        iri = "http://schema.org/starRating",
        iris = Set("http://schema.org/starRating"),
        label = "starRating",
        comment = """An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars).""",
        `@extends` = List(),
        `@range` = List(Rating.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}