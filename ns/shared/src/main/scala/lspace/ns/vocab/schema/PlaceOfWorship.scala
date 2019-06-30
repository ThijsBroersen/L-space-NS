package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PlaceOfWorship extends OntologyDef(
        iri = "http://schema.org/PlaceOfWorship",
        iris = Set("http://schema.org/PlaceOfWorship"),
        label = "PlaceOfWorship",
        comment = """Place of worship, such as a church, synagogue, or mosque.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}