package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object webCheckinTime
    extends PropertyDef(
      iri = "http://schema.org/webCheckinTime",
      iris = Set("http://schema.org/webCheckinTime"),
      label = "webCheckinTime",
      comment = """The time when a passenger can check into the flight online.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
