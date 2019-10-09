package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object endorsers extends PropertyDef(
        iri = "http://schema.org/endorsers",
        iris = Set("http://schema.org/endorsers"),
        label = "endorsers",
        comment = """People or organizations that endorse the plan.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}