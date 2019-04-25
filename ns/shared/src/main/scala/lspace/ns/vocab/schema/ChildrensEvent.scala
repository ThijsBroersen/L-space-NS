package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ChildrensEvent
    extends OntologyDef(
      iri = "http://schema.org/ChildrensEvent",
      iris = Set("http://schema.org/ChildrensEvent"),
      label = "ChildrensEvent",
      comment = """Event type: Children's event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
