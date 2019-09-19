package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalConditionStage extends OntologyDef(
        iri = "http://schema.org/MedicalConditionStage",
        iris = Set("http://schema.org/MedicalConditionStage"),
        label = "MedicalConditionStage",
        comment = """A stage of a medical condition, such as 'Stage IIIa'.""",
        `@extends` = () => List(MedicalIntangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val stageAsNumber = lspace.ns.vocab.schema.stageAsNumber.property
lazy val subStageSuffix = lspace.ns.vocab.schema.subStageSuffix.property
}
override lazy val properties: List[LProperty] = List(stageAsNumber, subStageSuffix)
trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val stageAsNumber = lspace.ns.vocab.schema.stageAsNumber.property
lazy val subStageSuffix = lspace.ns.vocab.schema.subStageSuffix.property
}
}