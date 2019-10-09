package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PropertyValue extends OntologyDef(
        iri = "http://schema.org/PropertyValue",
        iris = Set("http://schema.org/PropertyValue"),
        label = "PropertyValue",
        comment = """A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.<br/><br/>

Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val propertyID = lspace.ns.vocab.schema.propertyID.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
lazy val value = lspace.ns.vocab.schema.value.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
override lazy val properties: List[LProperty] = List(maxValue, measurementTechnique, minValue, propertyID, unitCode, unitText, value, valueReference)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val propertyID = lspace.ns.vocab.schema.propertyID.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
lazy val value = lspace.ns.vocab.schema.value.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
}