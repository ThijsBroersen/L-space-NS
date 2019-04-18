package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object processingTime
    extends PropertyDef(
      iri = "http://schema.org/processingTime",
      iris = Set("http://schema.org/processingTime"),
      label = "processingTime",
      comment = """Estimated processing time for the service using this channel.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
