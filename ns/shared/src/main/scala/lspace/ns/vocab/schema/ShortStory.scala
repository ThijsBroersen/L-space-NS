package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ShortStory
    extends OntologyDef(
      iri = "http://schema.org/ShortStory",
      iris = Set("http://schema.org/ShortStory"),
      label = "ShortStory",
      comment = """Short story or tale. A brief work of literature, usually written in narrative prose.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
