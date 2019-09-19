package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object employees extends PropertyDef(
        iri = "http://schema.org/employees",
        iris = Set("http://schema.org/employees"),
        label = "employees",
        comment = """People working for this organization.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}