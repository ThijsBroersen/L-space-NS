package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ShoppingCenter extends OntologyDef(
        iri = "http://schema.org/ShoppingCenter",
        iris = Set("http://schema.org/ShoppingCenter"),
        label = "ShoppingCenter",
        comment = """A shopping center or mall.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}