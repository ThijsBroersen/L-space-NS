package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object HowToSection
    extends OntologyDef(
      iri = "http://schema.org/HowToSection",
      iris = Set("http://schema.org/HowToSection"),
      label = "HowToSection",
      comment =
        """A sub-grouping of steps in the instructions for how to achieve a result (e.g. steps for making a pie crust within a pie recipe).""",
      `@extends` = () => List(ListItem.ontology, CreativeWork.ontology, ItemList.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.ListItem.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties
      with lspace.ns.vocab.schema.ItemList.Properties {
    lazy val steps = lspace.ns.vocab.schema.steps.property
  }
  override lazy val properties: List[Property] = List(steps)
  trait Properties
      extends lspace.ns.vocab.schema.ListItem.Properties
      with lspace.ns.vocab.schema.CreativeWork.Properties
      with lspace.ns.vocab.schema.ItemList.Properties {
    lazy val steps = lspace.ns.vocab.schema.steps.property
  }
}
