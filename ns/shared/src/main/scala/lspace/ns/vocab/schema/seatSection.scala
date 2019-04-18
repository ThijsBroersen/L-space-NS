package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object seatSection
    extends PropertyDef(
      iri = "http://schema.org/seatSection",
      iris = Set("http://schema.org/seatSection"),
      label = "seatSection",
      comment = """The section location of the reserved seat (e.g. Orchestra).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
