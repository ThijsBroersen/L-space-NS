package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pathophysiology
    extends PropertyDef(
      iri = "http://schema.org/pathophysiology",
      iris = Set("http://schema.org/pathophysiology"),
      label = "pathophysiology",
      comment =
        """Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
