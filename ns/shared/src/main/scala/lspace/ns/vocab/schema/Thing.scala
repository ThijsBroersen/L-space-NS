package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Thing
    extends OntologyDef(
      iri = "http://schema.org/Thing",
      iris = Set("http://schema.org/Thing"),
      label = "Thing",
      comment = """The most generic type of item.""",
      `@extends` = () => List()
    ) {
  object keys {}
  override lazy val properties: List[Property] = List()
  trait Properties {}
}
