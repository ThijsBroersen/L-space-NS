package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MaximumDoseSchedule extends OntologyDef(
        iri = "http://schema.org/MaximumDoseSchedule",
        iris = Set("http://schema.org/MaximumDoseSchedule"),
        label = "MaximumDoseSchedule",
        comment = """The maximum dosing schedule considered safe for a drug or supplement as recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.""",
        `@extends` = () => List(DoseSchedule.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DoseSchedule.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DoseSchedule.Properties{

}
}