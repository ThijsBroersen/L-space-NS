package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object availabilityEnds
    extends PropertyDef(
      iri = "http://schema.org/availabilityEnds",
      iris = Set("http://schema.org/availabilityEnds"),
      label = "availabilityEnds",
      comment = """The end of the availability of the product or service included in the offer.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
