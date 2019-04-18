package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object adverseOutcome
    extends PropertyDef(
      iri = "http://schema.org/adverseOutcome",
      iris = Set("http://schema.org/adverseOutcome"),
      label = "adverseOutcome",
      comment =
        """A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
