package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object inBroadcastLineup
    extends PropertyDef(
      iri = "http://schema.org/inBroadcastLineup",
      iris = Set("http://schema.org/inBroadcastLineup"),
      label = "inBroadcastLineup",
      comment = """The CableOrSatelliteService offering the channel.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
