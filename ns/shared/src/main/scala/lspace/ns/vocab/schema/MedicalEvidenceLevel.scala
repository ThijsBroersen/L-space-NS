package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalEvidenceLevel extends OntologyDef(
        iri = "http://schema.org/MedicalEvidenceLevel",
        iris = Set("http://schema.org/MedicalEvidenceLevel"),
        label = "MedicalEvidenceLevel",
        comment = """Level of evidence for a medical guideline. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}