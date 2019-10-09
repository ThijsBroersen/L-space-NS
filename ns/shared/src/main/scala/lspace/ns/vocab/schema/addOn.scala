package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object addOn extends PropertyDef(
        iri = "http://schema.org/addOn",
        iris = Set("http://schema.org/addOn"),
        label = "addOn",
        comment = """An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).""",
        `@extends` = List(),
        `@range` = List(Offer.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}