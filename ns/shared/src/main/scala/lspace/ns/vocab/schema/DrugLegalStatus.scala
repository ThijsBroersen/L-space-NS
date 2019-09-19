package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugLegalStatus extends OntologyDef(
        iri = "http://schema.org/DrugLegalStatus",
        iris = Set("http://schema.org/DrugLegalStatus"),
        label = "DrugLegalStatus",
        comment = """The legal availability status of a medical drug.""",
        `@extends` = () => List(MedicalIntangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val applicableLocation = lspace.ns.vocab.schema.applicableLocation.property
}
override lazy val properties: List[LProperty] = List(applicableLocation)
trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val applicableLocation = lspace.ns.vocab.schema.applicableLocation.property
}
}