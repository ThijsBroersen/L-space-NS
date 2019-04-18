package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object endOffset extends PropertyDef(
        iri = "http://schema.org/endOffset",
        iris = Set("http://schema.org/endOffset"),
        label = "endOffset",
        comment = """The end time of the clip expressed as the number of seconds from the beginning of the work.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}