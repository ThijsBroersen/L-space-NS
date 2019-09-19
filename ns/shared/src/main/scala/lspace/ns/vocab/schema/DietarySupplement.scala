package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DietarySupplement extends OntologyDef(
        iri = "http://schema.org/DietarySupplement",
        iris = Set("http://schema.org/DietarySupplement"),
        label = "DietarySupplement",
        comment = """A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.""",
        `@extends` = () => List(Substance.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Substance.Properties{
lazy val background = lspace.ns.vocab.schema.background.property
lazy val isProprietary = lspace.ns.vocab.schema.isProprietary.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val mechanismOfAction = lspace.ns.vocab.schema.mechanismOfAction.property
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
lazy val proprietaryName = lspace.ns.vocab.schema.proprietaryName.property
lazy val recommendedIntake = lspace.ns.vocab.schema.recommendedIntake.property
lazy val safetyConsideration = lspace.ns.vocab.schema.safetyConsideration.property
lazy val targetPopulation = lspace.ns.vocab.schema.targetPopulation.property
}
override lazy val properties: List[LProperty] = List(background, isProprietary, manufacturer, mechanismOfAction, nonProprietaryName, proprietaryName, recommendedIntake, safetyConsideration, targetPopulation)
trait Properties extends lspace.ns.vocab.schema.Substance.Properties{
lazy val background = lspace.ns.vocab.schema.background.property
lazy val isProprietary = lspace.ns.vocab.schema.isProprietary.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val mechanismOfAction = lspace.ns.vocab.schema.mechanismOfAction.property
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
lazy val proprietaryName = lspace.ns.vocab.schema.proprietaryName.property
lazy val recommendedIntake = lspace.ns.vocab.schema.recommendedIntake.property
lazy val safetyConsideration = lspace.ns.vocab.schema.safetyConsideration.property
lazy val targetPopulation = lspace.ns.vocab.schema.targetPopulation.property
}
}