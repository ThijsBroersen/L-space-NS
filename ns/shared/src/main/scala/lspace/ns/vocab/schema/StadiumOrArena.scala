package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object StadiumOrArena extends OntologyDef(
        iri = "http://schema.org/StadiumOrArena",
        iris = Set("http://schema.org/StadiumOrArena"),
        label = "StadiumOrArena",
        comment = """A stadium.""",
        `@extends` = () => List(CivicStructure.ontology, SportsActivityLocation.ontology)
       ){
}