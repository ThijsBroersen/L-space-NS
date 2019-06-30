package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PriceSpecification extends OntologyDef(
        iri = "http://schema.org/PriceSpecification",
        iris = Set("http://schema.org/PriceSpecification"),
        label = "PriceSpecification",
        comment = """A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}