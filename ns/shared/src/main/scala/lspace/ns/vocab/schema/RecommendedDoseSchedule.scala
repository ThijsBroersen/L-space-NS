package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RecommendedDoseSchedule extends OntologyDef(
        iri = "http://schema.org/RecommendedDoseSchedule",
        iris = Set("http://schema.org/RecommendedDoseSchedule"),
        label = "RecommendedDoseSchedule",
        comment = """A recommended dosing schedule for a drug or supplement as prescribed or recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.""",
        `@extends` = () => List(DoseSchedule.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DoseSchedule.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DoseSchedule.Properties{

}
}