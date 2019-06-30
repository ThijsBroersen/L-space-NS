package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OccupationalTherapy extends OntologyDef(
        iri = "http://schema.org/OccupationalTherapy",
        iris = Set("http://schema.org/OccupationalTherapy"),
        label = "OccupationalTherapy",
        comment = """A treatment of people with physical, emotional, or social problems, using purposeful activity to help them overcome or learn to deal with their problems.""",
        `@extends` = () => List(MedicalTherapy.ontology)
       ){
}