package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object headline extends PropertyDef(
        iri = "https://schema.org/headline",
        iris = Set("https://schema.org/headline"),
        label = "headline",
        comment = """Headline of the article.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}