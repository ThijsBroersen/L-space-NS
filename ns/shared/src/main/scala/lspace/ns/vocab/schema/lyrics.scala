package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object lyrics
    extends PropertyDef(
      iri = "http://schema.org/lyrics",
      iris = Set("http://schema.org/lyrics"),
      label = "lyrics",
      comment = """The words in the song.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
