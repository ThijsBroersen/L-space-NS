package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object datePublished extends PropertyDef(
        iri = "https://schema.org/datePublished",
        iris = Set("https://schema.org/datePublished"),
        label = "datePublished",
        comment = """Date of first broadcast/publication.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}