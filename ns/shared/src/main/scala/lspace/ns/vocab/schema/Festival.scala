package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Festival
    extends OntologyDef(
      iri = "http://schema.org/Festival",
      iris = Set("http://schema.org/Festival"),
      label = "Festival",
      comment = """Event type: Festival.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
