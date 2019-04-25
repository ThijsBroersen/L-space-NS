package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object secondaryPrevention
    extends PropertyDef(
      iri = "http://schema.org/secondaryPrevention",
      iris = Set("http://schema.org/secondaryPrevention"),
      label = "secondaryPrevention",
      comment =
        """A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalTherapy.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
