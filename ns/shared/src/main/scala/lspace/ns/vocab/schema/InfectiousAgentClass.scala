package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InfectiousAgentClass extends OntologyDef(
        iri = "http://schema.org/InfectiousAgentClass",
        iris = Set("http://schema.org/InfectiousAgentClass"),
        label = "InfectiousAgentClass",
        comment = """Classes of agents or pathogens that transmit infectious diseases. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}