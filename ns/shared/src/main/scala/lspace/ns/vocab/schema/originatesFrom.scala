package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object originatesFrom
    extends PropertyDef(
      iri = "http://schema.org/originatesFrom",
      iris = Set("http://schema.org/originatesFrom"),
      label = "originatesFrom",
      comment = """The vasculature the lymphatic structure originates, or afferents, from.""",
      `@extends` = () => List(),
      `@range` = () => List(Vessel.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
