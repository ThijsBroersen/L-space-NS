package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InfectiousDisease extends OntologyDef(
        iri = "http://schema.org/InfectiousDisease",
        iris = Set("http://schema.org/InfectiousDisease"),
        label = "InfectiousDisease",
        comment = """An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.""",
        `@extends` = () => List(MedicalCondition.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalCondition.Properties{
lazy val infectiousAgentClass = lspace.ns.vocab.schema.infectiousAgentClass.property
lazy val transmissionMethod = lspace.ns.vocab.schema.transmissionMethod.property
}
override lazy val properties: List[LProperty] = List(infectiousAgentClass, transmissionMethod)
trait Properties extends lspace.ns.vocab.schema.MedicalCondition.Properties{
lazy val infectiousAgentClass = lspace.ns.vocab.schema.infectiousAgentClass.property
lazy val transmissionMethod = lspace.ns.vocab.schema.transmissionMethod.property
}
}