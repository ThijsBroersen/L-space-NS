package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AdministrativeArea
    extends OntologyDef(
      iri = "http://schema.org/AdministrativeArea",
      iris = Set("http://schema.org/AdministrativeArea"),
      label = "AdministrativeArea",
      comment = """A geographical region, typically under the jurisdiction of a particular government.""",
      `@extends` = () => List(Place.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Place.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Place.Properties {}
}
