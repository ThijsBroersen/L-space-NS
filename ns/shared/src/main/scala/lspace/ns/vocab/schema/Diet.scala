package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Diet
    extends OntologyDef(
      iri = "http://schema.org/Diet",
      iris = Set("http://schema.org/Diet"),
      label = "Diet",
      comment = """A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.""",
      `@extends` = () => List(LifestyleModification.ontology, CreativeWork.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.LifestyleModification.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val dietFeatures = lspace.ns.vocab.schema.dietFeatures.property
  }
  override lazy val properties: List[Property] = List(dietFeatures)
  trait Properties
      extends lspace.ns.vocab.schema.LifestyleModification.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val dietFeatures = lspace.ns.vocab.schema.dietFeatures.property
  }
}
