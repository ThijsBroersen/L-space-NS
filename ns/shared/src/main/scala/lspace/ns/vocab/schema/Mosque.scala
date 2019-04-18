package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Mosque
    extends OntologyDef(
      iri = "http://schema.org/Mosque",
      iris = Set("http://schema.org/Mosque"),
      label = "Mosque",
      comment = """A mosque.""",
      `@extends` = () => List(PlaceOfWorship.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
}
