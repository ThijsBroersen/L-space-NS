package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugStrength
    extends OntologyDef(
      iri = "http://schema.org/DrugStrength",
      iris = Set("http://schema.org/DrugStrength"),
      label = "DrugStrength",
      comment = """A specific strength in which a medical drug is available in a specific country.""",
      `@extends` = () => List(MedicalIntangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties {
    lazy val maximumIntake    = lspace.ns.vocab.schema.maximumIntake.property
    lazy val strengthValue    = lspace.ns.vocab.schema.strengthValue.property
    lazy val activeIngredient = lspace.ns.vocab.schema.activeIngredient.property
  }
  override lazy val properties: List[LProperty] = List(maximumIntake, strengthValue, activeIngredient)
  trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties {
    lazy val maximumIntake    = lspace.ns.vocab.schema.maximumIntake.property
    lazy val strengthValue    = lspace.ns.vocab.schema.strengthValue.property
    lazy val activeIngredient = lspace.ns.vocab.schema.activeIngredient.property
  }
}
