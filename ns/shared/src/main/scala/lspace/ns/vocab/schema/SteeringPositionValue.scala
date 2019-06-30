package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SteeringPositionValue extends OntologyDef(
        iri = "http://schema.org/SteeringPositionValue",
        iris = Set("http://schema.org/SteeringPositionValue"),
        label = "SteeringPositionValue",
        comment = """A value indicating a steering position.""",
        `@extends` = () => List(QualitativeValue.ontology)
       ){
}