package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicVideoObject
    extends OntologyDef(
      iri = "http://schema.org/MusicVideoObject",
      iris = Set("http://schema.org/MusicVideoObject"),
      label = "MusicVideoObject",
      comment = """A music video file.""",
      `@extends` = () => List(MediaObject.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MediaObject.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties {}
}
