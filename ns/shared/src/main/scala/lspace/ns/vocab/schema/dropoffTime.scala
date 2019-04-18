package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dropoffTime
    extends PropertyDef(
      iri = "http://schema.org/dropoffTime",
      iris = Set("http://schema.org/dropoffTime"),
      label = "dropoffTime",
      comment = """When a rental car can be dropped off.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
