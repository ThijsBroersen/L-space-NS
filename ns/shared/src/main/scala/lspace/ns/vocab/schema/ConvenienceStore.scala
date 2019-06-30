package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ConvenienceStore extends OntologyDef(
        iri = "http://schema.org/ConvenienceStore",
        iris = Set("http://schema.org/ConvenienceStore"),
        label = "ConvenienceStore",
        comment = """A convenience store.""",
        `@extends` = () => List(Store.ontology)
       ){
}