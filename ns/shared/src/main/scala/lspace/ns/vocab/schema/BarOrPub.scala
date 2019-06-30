package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BarOrPub extends OntologyDef(
        iri = "http://schema.org/BarOrPub",
        iris = Set("http://schema.org/BarOrPub"),
        label = "BarOrPub",
        comment = """A bar or pub.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}