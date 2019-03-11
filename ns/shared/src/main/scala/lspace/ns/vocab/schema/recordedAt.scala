package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object recordedAt extends PropertyDef(
        iri = "https://schema.org/recordedAt",
        iris = Set("https://schema.org/recordedAt"),
        label = "recordedAt",
        comment = """The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}