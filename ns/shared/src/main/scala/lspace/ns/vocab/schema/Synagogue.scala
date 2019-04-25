package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Synagogue
    extends OntologyDef(
      iri = "http://schema.org/Synagogue",
      iris = Set("http://schema.org/Synagogue"),
      label = "Synagogue",
      comment = """A synagogue.""",
      `@extends` = () => List(PlaceOfWorship.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
}
