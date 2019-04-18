package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TreatmentIndication extends OntologyDef(
        iri = "http://schema.org/TreatmentIndication",
        iris = Set("http://schema.org/TreatmentIndication"),
        label = "TreatmentIndication",
        comment = """An indication for treating an underlying condition, symptom, etc.""",
        `@extends` = () => List(MedicalIndication.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalIndication.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalIndication.Properties{

}
}