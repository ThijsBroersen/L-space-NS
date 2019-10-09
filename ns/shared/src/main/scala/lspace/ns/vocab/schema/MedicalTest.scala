package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalTest extends OntologyDef(
        iri = "http://schema.org/MedicalTest",
        iris = Set("http://schema.org/MedicalTest"),
        label = "MedicalTest",
        comment = """Any medical test, typically performed for diagnostic purposes.""",
        `@extends` = List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val affectedBy = lspace.ns.vocab.schema.affectedBy.property
lazy val normalRange = lspace.ns.vocab.schema.normalRange.property
lazy val signDetected = lspace.ns.vocab.schema.signDetected.property
lazy val usedToDiagnose = lspace.ns.vocab.schema.usedToDiagnose.property
lazy val usesDevice = lspace.ns.vocab.schema.usesDevice.property
}
override lazy val properties: List[LProperty] = List(affectedBy, normalRange, signDetected, usedToDiagnose, usesDevice)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val affectedBy = lspace.ns.vocab.schema.affectedBy.property
lazy val normalRange = lspace.ns.vocab.schema.normalRange.property
lazy val signDetected = lspace.ns.vocab.schema.signDetected.property
lazy val usedToDiagnose = lspace.ns.vocab.schema.usedToDiagnose.property
lazy val usesDevice = lspace.ns.vocab.schema.usesDevice.property
}
}