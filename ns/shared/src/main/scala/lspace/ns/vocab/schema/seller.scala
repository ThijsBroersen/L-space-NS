package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seller extends PropertyDef(
        iri = "http://schema.org/seller",
        iris = Set("http://schema.org/seller"),
        label = "seller",
        comment = """An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.""",
        `@extends` = List(participant.property),
        `@range` = List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.participant.Properties
}