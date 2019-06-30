package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object diagnosis extends PropertyDef(
        iri = "http://schema.org/diagnosis",
        iris = Set("http://schema.org/diagnosis"),
        label = "diagnosis",
        comment = """One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalCondition.ontology)
       ){
}