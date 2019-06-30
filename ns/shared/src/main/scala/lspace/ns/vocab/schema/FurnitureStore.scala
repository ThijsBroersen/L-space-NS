package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FurnitureStore extends OntologyDef(
        iri = "http://schema.org/FurnitureStore",
        iris = Set("http://schema.org/FurnitureStore"),
        label = "FurnitureStore",
        comment = """A furniture store.""",
        `@extends` = () => List(Store.ontology)
       ){
}