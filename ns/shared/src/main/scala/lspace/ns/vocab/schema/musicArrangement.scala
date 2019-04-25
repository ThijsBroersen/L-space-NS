package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicArrangement
    extends PropertyDef(
      iri = "http://schema.org/musicArrangement",
      iris = Set("http://schema.org/musicArrangement"),
      label = "musicArrangement",
      comment = """An arrangement derived from the composition.""",
      `@extends` = () => List(),
      `@range` = () => List(MusicComposition.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
