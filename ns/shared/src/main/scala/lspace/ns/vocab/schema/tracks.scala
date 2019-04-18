package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object tracks
    extends PropertyDef(
      iri = "http://schema.org/tracks",
      iris = Set("http://schema.org/tracks"),
      label = "tracks",
      comment = """A music recording (track)&#x2014;usually a single song.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
