package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object customer extends PropertyDef(
        iri = "http://schema.org/customer",
        iris = Set("http://schema.org/customer"),
        label = "customer",
        comment = """Party placing the order or paying the invoice.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}