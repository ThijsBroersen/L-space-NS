package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dosageForm
    extends PropertyDef(
      iri = "http://schema.org/dosageForm",
      iris = Set("http://schema.org/dosageForm"),
      label = "dosageForm",
      comment =
        """A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
