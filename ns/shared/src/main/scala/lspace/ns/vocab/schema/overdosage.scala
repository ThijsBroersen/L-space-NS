package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object overdosage
    extends PropertyDef(
      iri = "http://schema.org/overdosage",
      iris = Set("http://schema.org/overdosage"),
      label = "overdosage",
      comment =
        """Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
