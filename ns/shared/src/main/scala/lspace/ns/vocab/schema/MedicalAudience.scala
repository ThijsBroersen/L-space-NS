package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalAudience extends OntologyDef(
        iri = "http://schema.org/MedicalAudience",
        iris = Set("http://schema.org/MedicalAudience"),
        label = "MedicalAudience",
        comment = """Target audiences for medical web pages. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology, Audience.ontology, PeopleAudience.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties with lspace.ns.vocab.schema.Audience.Properties with lspace.ns.vocab.schema.PeopleAudience.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties with lspace.ns.vocab.schema.Audience.Properties with lspace.ns.vocab.schema.PeopleAudience.Properties{

}
}