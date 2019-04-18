package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MovieClip
    extends OntologyDef(
      iri = "http://schema.org/MovieClip",
      iris = Set("http://schema.org/MovieClip"),
      label = "MovieClip",
      comment = """A short segment/part of a movie.""",
      `@extends` = () => List(Clip.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Clip.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Clip.Properties {}
}
