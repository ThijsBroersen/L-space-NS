package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object trailer
    extends PropertyDef(
      iri = "http://schema.org/trailer",
      iris = Set("http://schema.org/trailer"),
      label = "trailer",
      comment = """The trailer of a movie or tv/radio series, season, episode, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(VideoObject.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
