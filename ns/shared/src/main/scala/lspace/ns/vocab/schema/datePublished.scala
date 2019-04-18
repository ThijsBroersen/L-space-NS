package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object datePublished extends PropertyDef(
        iri = "http://schema.org/datePublished",
        iris = Set("http://schema.org/datePublished"),
        label = "datePublished",
        comment = """Date of first broadcast/publication.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}