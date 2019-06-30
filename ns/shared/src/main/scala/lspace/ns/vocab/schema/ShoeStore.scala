package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ShoeStore extends OntologyDef(
        iri = "http://schema.org/ShoeStore",
        iris = Set("http://schema.org/ShoeStore"),
        label = "ShoeStore",
        comment = """A shoe store.""",
        `@extends` = () => List(Store.ontology)
       ){
}