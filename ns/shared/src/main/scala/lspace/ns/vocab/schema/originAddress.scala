package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object originAddress extends PropertyDef(
        iri = "http://schema.org/originAddress",
        iris = Set("http://schema.org/originAddress"),
        label = "originAddress",
        comment = """Shipper's address.""",
        `@extends` = List(),
        `@range` = List(PostalAddress.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}