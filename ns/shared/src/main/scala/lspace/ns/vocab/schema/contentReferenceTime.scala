package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contentReferenceTime extends PropertyDef(
        iri = "http://schema.org/contentReferenceTime",
        iris = Set("http://schema.org/contentReferenceTime"),
        label = "contentReferenceTime",
        comment = """The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}