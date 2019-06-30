package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EventVenue extends OntologyDef(
        iri = "http://schema.org/EventVenue",
        iris = Set("http://schema.org/EventVenue"),
        label = "EventVenue",
        comment = """An event venue.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}