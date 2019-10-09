package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object merchant extends PropertyDef(
        iri = "http://schema.org/merchant",
        iris = Set("http://schema.org/merchant"),
        label = "merchant",
        comment = """'merchant' is an out-dated term for 'seller'.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}