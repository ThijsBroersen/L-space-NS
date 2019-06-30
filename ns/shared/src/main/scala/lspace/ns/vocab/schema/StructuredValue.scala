package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object StructuredValue extends OntologyDef(
        iri = "http://schema.org/StructuredValue",
        iris = Set("http://schema.org/StructuredValue"),
        label = "StructuredValue",
        comment = """Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}