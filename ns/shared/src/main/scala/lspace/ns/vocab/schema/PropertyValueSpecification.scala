package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PropertyValueSpecification extends OntologyDef(
        iri = "http://schema.org/PropertyValueSpecification",
        iris = Set("http://schema.org/PropertyValueSpecification"),
        label = "PropertyValueSpecification",
        comment = """A Property value specification.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val defaultValue = lspace.ns.vocab.schema.defaultValue.property
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val multipleValues = lspace.ns.vocab.schema.multipleValues.property
lazy val readonlyValue = lspace.ns.vocab.schema.readonlyValue.property
lazy val stepValue = lspace.ns.vocab.schema.stepValue.property
lazy val valueMaxLength = lspace.ns.vocab.schema.valueMaxLength.property
lazy val valueMinLength = lspace.ns.vocab.schema.valueMinLength.property
lazy val valueName = lspace.ns.vocab.schema.valueName.property
lazy val valuePattern = lspace.ns.vocab.schema.valuePattern.property
lazy val valueRequired = lspace.ns.vocab.schema.valueRequired.property
}
override lazy val properties: List[LProperty] = List(defaultValue, maxValue, minValue, multipleValues, readonlyValue, stepValue, valueMaxLength, valueMinLength, valueName, valuePattern, valueRequired)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val defaultValue = lspace.ns.vocab.schema.defaultValue.property
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val multipleValues = lspace.ns.vocab.schema.multipleValues.property
lazy val readonlyValue = lspace.ns.vocab.schema.readonlyValue.property
lazy val stepValue = lspace.ns.vocab.schema.stepValue.property
lazy val valueMaxLength = lspace.ns.vocab.schema.valueMaxLength.property
lazy val valueMinLength = lspace.ns.vocab.schema.valueMinLength.property
lazy val valueName = lspace.ns.vocab.schema.valueName.property
lazy val valuePattern = lspace.ns.vocab.schema.valuePattern.property
lazy val valueRequired = lspace.ns.vocab.schema.valueRequired.property
}
}