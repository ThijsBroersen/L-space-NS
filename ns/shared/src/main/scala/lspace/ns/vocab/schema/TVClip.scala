package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TVClip
    extends OntologyDef(
      iri = "http://schema.org/TVClip",
      iris = Set("http://schema.org/TVClip"),
      label = "TVClip",
      comment = """A short TV program or a segment/part of a TV program.""",
      `@extends` = () => List(Clip.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Clip.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Clip.Properties {}
}
