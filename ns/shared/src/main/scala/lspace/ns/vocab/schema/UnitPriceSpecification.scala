package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UnitPriceSpecification extends OntologyDef(
        iri = "http://schema.org/UnitPriceSpecification",
        iris = Set("http://schema.org/UnitPriceSpecification"),
        label = "UnitPriceSpecification",
        comment = """The price asked for a given offer by the respective organization or person.""",
        `@extends` = () => List(PriceSpecification.ontology)
       ){
}