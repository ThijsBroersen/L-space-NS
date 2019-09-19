package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DiagnosticLab extends OntologyDef(
        iri = "http://schema.org/DiagnosticLab",
        iris = Set("http://schema.org/DiagnosticLab"),
        label = "DiagnosticLab",
        comment = """A medical laboratory that offers on-site or off-site diagnostic services.""",
        `@extends` = () => List(MedicalOrganization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalOrganization.Properties{
lazy val availableTest = lspace.ns.vocab.schema.availableTest.property
}
override lazy val properties: List[LProperty] = List(availableTest)
trait Properties extends lspace.ns.vocab.schema.MedicalOrganization.Properties{
lazy val availableTest = lspace.ns.vocab.schema.availableTest.property
}
}