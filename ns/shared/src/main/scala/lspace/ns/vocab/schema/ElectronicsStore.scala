package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ElectronicsStore extends OntologyDef(
        iri = "http://schema.org/ElectronicsStore",
        iris = Set("http://schema.org/ElectronicsStore"),
        label = "ElectronicsStore",
        comment = """An electronics store.""",
        `@extends` = () => List(Store.ontology)
       ){
}