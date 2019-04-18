package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object includedComposition
    extends PropertyDef(
      iri = "http://schema.org/includedComposition",
      iris = Set("http://schema.org/includedComposition"),
      label = "includedComposition",
      comment = """Smaller compositions included in this work (e.g. a movement in a symphony).""",
      `@extends` = () => List(),
      `@range` = () => List(MusicComposition.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
