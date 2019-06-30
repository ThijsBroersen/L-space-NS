package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PropertyValue extends OntologyDef(
        iri = "http://schema.org/PropertyValue",
        iris = Set("http://schema.org/PropertyValue"),
        label = "PropertyValue",
        comment = """A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.<br/><br/>

Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}