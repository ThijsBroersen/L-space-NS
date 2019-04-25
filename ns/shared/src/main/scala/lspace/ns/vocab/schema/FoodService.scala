package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodService
    extends OntologyDef(
      iri = "http://schema.org/FoodService",
      iris = Set("http://schema.org/FoodService"),
      label = "FoodService",
      comment = """A food service, like breakfast, lunch, or dinner.""",
      `@extends` = () => List(Service.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Service.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Service.Properties {}
}
