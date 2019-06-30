package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WholesaleStore extends OntologyDef(
        iri = "http://schema.org/WholesaleStore",
        iris = Set("http://schema.org/WholesaleStore"),
        label = "WholesaleStore",
        comment = """A wholesale store.""",
        `@extends` = () => List(Store.ontology)
       ){
}