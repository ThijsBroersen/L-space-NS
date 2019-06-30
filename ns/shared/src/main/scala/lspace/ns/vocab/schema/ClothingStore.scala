package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ClothingStore extends OntologyDef(
        iri = "http://schema.org/ClothingStore",
        iris = Set("http://schema.org/ClothingStore"),
        label = "ClothingStore",
        comment = """A clothing store.""",
        `@extends` = () => List(Store.ontology)
       ){
}