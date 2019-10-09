package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object printSection extends PropertyDef(
        iri = "http://schema.org/printSection",
        iris = Set("http://schema.org/printSection"),
        label = "printSection",
        comment = """If this NewsArticle appears in print, this field indicates the print section in which the article appeared.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}