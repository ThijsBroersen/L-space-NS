package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DoseSchedule extends OntologyDef(
        iri = "http://schema.org/DoseSchedule",
        iris = Set("http://schema.org/DoseSchedule"),
        label = "DoseSchedule",
        comment = """A specific dosing schedule for a drug or supplement.""",
        `@extends` = () => List(MedicalIntangible.ontology)
       ){
}