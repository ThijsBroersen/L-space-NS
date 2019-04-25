package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EatAction
    extends OntologyDef(
      iri = "http://schema.org/EatAction",
      iris = Set("http://schema.org/EatAction"),
      label = "EatAction",
      comment = """The act of swallowing solid objects.""",
      `@extends` = () => List(ConsumeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
}
