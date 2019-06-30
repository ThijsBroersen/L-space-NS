package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BikeStore extends OntologyDef(
        iri = "http://schema.org/BikeStore",
        iris = Set("http://schema.org/BikeStore"),
        label = "BikeStore",
        comment = """A bike store.""",
        `@extends` = () => List(Store.ontology)
       ){
}