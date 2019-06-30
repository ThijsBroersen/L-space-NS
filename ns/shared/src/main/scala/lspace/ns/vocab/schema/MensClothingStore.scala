package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MensClothingStore extends OntologyDef(
        iri = "http://schema.org/MensClothingStore",
        iris = Set("http://schema.org/MensClothingStore"),
        label = "MensClothingStore",
        comment = """A men's clothing store.""",
        `@extends` = () => List(Store.ontology)
       ){
}