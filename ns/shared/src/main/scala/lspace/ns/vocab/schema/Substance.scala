package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Substance extends OntologyDef(
        iri = "http://schema.org/Substance",
        iris = Set("http://schema.org/Substance"),
        label = "Substance",
        comment = """Any matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val activeIngredient = lspace.ns.vocab.schema.activeIngredient.property
lazy val maximumIntake = lspace.ns.vocab.schema.maximumIntake.property
}
override lazy val properties: List[LProperty] = List(activeIngredient, maximumIntake)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val activeIngredient = lspace.ns.vocab.schema.activeIngredient.property
lazy val maximumIntake = lspace.ns.vocab.schema.maximumIntake.property
}
}