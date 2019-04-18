package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object broadcastTimezone
    extends PropertyDef(
      iri = "http://schema.org/broadcastTimezone",
      iris = Set("http://schema.org/broadcastTimezone"),
      label = "broadcastTimezone",
      comment =
        """The timezone in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> for which the service bases its broadcasts""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
