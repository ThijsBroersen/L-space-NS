package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Seat
    extends OntologyDef(
      iri = "http://schema.org/Seat",
      iris = Set("http://schema.org/Seat"),
      label = "Seat",
      comment = """Used to describe a seat, such as a reserved seat in an event reservation.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {}
}
