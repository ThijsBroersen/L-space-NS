package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availabilityStarts
    extends PropertyDef(
      iri = "http://schema.org/availabilityStarts",
      iris = Set("http://schema.org/availabilityStarts"),
      label = "availabilityStarts",
      comment = """The beginning of the availability of the product or service included in the offer.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
