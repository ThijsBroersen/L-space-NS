package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object releasedEvent extends PropertyDef(
        iri = "https://schema.org/releasedEvent",
        iris = Set("https://schema.org/releasedEvent"),
        label = "releasedEvent",
        comment = """The place and time the release was issued, expressed as a PublicationEvent.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}