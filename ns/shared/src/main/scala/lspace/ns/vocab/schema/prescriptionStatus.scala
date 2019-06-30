package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object prescriptionStatus extends PropertyDef(
        iri = "http://schema.org/prescriptionStatus",
        iris = Set("http://schema.org/prescriptionStatus"),
        label = "prescriptionStatus",
        comment = """Indicates the status of drug prescription eg. local catalogs classifications or whether the drug is available by prescription or over-the-counter, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(DrugPrescriptionStatus.ontology, Text.ontology)
       ){
}