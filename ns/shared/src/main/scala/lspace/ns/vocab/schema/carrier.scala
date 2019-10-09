package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object carrier extends PropertyDef(
        iri = "http://schema.org/carrier",
        iris = Set("http://schema.org/carrier"),
        label = "carrier",
        comment = """'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}