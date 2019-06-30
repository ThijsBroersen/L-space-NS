package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CivicStructure extends OntologyDef(
        iri = "http://schema.org/CivicStructure",
        iris = Set("http://schema.org/CivicStructure"),
        label = "CivicStructure",
        comment = """A public structure, such as a town hall or concert hall.""",
        `@extends` = () => List(Place.ontology)
       ){
}