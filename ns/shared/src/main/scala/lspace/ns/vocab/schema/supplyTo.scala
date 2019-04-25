package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object supplyTo
    extends PropertyDef(
      iri = "http://schema.org/supplyTo",
      iris = Set("http://schema.org/supplyTo"),
      label = "supplyTo",
      comment = """The area to which the artery supplies blood.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
