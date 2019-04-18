package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object providesBroadcastService
    extends PropertyDef(
      iri = "http://schema.org/providesBroadcastService",
      iris = Set("http://schema.org/providesBroadcastService"),
      label = "providesBroadcastService",
      comment = """The BroadcastService offered on this channel.""",
      `@extends` = () => List(),
      `@range` = () => List(BroadcastService.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
