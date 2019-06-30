package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Aquarium extends OntologyDef(
        iri = "http://schema.org/Aquarium",
        iris = Set("http://schema.org/Aquarium"),
        label = "Aquarium",
        comment = """Aquarium.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}