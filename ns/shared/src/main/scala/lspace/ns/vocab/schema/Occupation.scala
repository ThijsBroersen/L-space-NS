package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Occupation
    extends OntologyDef(
      iri = "http://schema.org/Occupation",
      iris = Set("http://schema.org/Occupation"),
      label = "Occupation",
      comment = """A profession, may involve prolonged training and/or a formal qualification.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val estimatedSalary        = lspace.ns.vocab.schema.estimatedSalary.property
    lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
    lazy val occupationalCategory   = lspace.ns.vocab.schema.occupationalCategory.property
  }
  override lazy val properties: List[LProperty] = List(estimatedSalary, experienceRequirements, occupationalCategory)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val estimatedSalary        = lspace.ns.vocab.schema.estimatedSalary.property
    lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
    lazy val occupationalCategory   = lspace.ns.vocab.schema.occupationalCategory.property
  }
}
