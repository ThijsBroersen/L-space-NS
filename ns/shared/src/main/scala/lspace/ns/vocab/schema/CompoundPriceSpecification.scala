package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CompoundPriceSpecification extends OntologyDef(
        iri = "http://schema.org/CompoundPriceSpecification",
        iris = Set("http://schema.org/CompoundPriceSpecification"),
        label = "CompoundPriceSpecification",
        comment = """A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. "electricity" or "final cleaning").""",
        `@extends` = List(PriceSpecification.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val priceComponent = lspace.ns.vocab.schema.priceComponent.property
}
override lazy val properties: List[LProperty] = List(priceComponent)
trait Properties extends lspace.ns.vocab.schema.PriceSpecification.Properties{
lazy val priceComponent = lspace.ns.vocab.schema.priceComponent.property
}
}