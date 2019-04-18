package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Season
    extends OntologyDef(
      iri = "http://schema.org/Season",
      iris = Set("http://schema.org/Season"),
      label = "Season",
      comment = """A media season e.g. tv, radio, video game etc.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
