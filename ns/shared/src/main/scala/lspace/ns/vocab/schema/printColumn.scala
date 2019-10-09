package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object printColumn extends PropertyDef(
        iri = "http://schema.org/printColumn",
        iris = Set("http://schema.org/printColumn"),
        label = "printColumn",
        comment = """The number of the column in which the NewsArticle appears in the print edition.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}