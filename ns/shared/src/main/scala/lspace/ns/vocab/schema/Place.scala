package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Place extends OntologyDef(
        iri = "http://schema.org/Place",
        iris = Set("http://schema.org/Place"),
        label = "Place",
        comment = """Entities that have a somewhat fixed, physical extension.""",
        `@extends` = () => List(Thing.ontology)
       ){
}