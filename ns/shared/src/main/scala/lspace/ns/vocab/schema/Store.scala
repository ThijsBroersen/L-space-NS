package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Store extends OntologyDef(
        iri = "http://schema.org/Store",
        iris = Set("http://schema.org/Store"),
        label = "Store",
        comment = """A retail good store.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}