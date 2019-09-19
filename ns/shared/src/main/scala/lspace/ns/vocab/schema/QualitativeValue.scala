package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QualitativeValue extends OntologyDef(
        iri = "http://schema.org/QualitativeValue",
        iris = Set("http://schema.org/QualitativeValue"),
        label = "QualitativeValue",
        comment = """A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val equal = lspace.ns.vocab.schema.equal.property
lazy val greater = lspace.ns.vocab.schema.greater.property
lazy val greaterOrEqual = lspace.ns.vocab.schema.greaterOrEqual.property
lazy val lesser = lspace.ns.vocab.schema.lesser.property
lazy val lesserOrEqual = lspace.ns.vocab.schema.lesserOrEqual.property
lazy val nonEqual = lspace.ns.vocab.schema.nonEqual.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
override lazy val properties: List[LProperty] = List(additionalProperty, equal, greater, greaterOrEqual, lesser, lesserOrEqual, nonEqual, valueReference)
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val equal = lspace.ns.vocab.schema.equal.property
lazy val greater = lspace.ns.vocab.schema.greater.property
lazy val greaterOrEqual = lspace.ns.vocab.schema.greaterOrEqual.property
lazy val lesser = lspace.ns.vocab.schema.lesser.property
lazy val lesserOrEqual = lspace.ns.vocab.schema.lesserOrEqual.property
lazy val nonEqual = lspace.ns.vocab.schema.nonEqual.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
}