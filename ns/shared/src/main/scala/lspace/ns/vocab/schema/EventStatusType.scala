package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EventStatusType extends OntologyDef(
        iri = "http://schema.org/EventStatusType",
        iris = Set("http://schema.org/EventStatusType"),
        label = "EventStatusType",
        comment = """EventStatusType is an enumeration type whose instances represent several states that an Event may be in.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}