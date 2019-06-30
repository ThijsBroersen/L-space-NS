package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TireShop extends OntologyDef(
        iri = "http://schema.org/TireShop",
        iris = Set("http://schema.org/TireShop"),
        label = "TireShop",
        comment = """A tire shop.""",
        `@extends` = () => List(Store.ontology)
       ){
}