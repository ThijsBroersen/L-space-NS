package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object followee extends PropertyDef(
        iri = "http://schema.org/followee",
        iris = Set("http://schema.org/followee"),
        label = "followee",
        comment = """A sub property of object. The person or organization being followed.""",
        `@extends` = List(`object`.property),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}