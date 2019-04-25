package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Church
    extends OntologyDef(
      iri = "http://schema.org/Church",
      iris = Set("http://schema.org/Church"),
      label = "Church",
      comment = """A church.""",
      `@extends` = () => List(PlaceOfWorship.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
}
