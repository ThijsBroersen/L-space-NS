package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object primaryImageOfPage extends PropertyDef(
        iri = "http://schema.org/primaryImageOfPage",
        iris = Set("http://schema.org/primaryImageOfPage"),
        label = "primaryImageOfPage",
        comment = """Indicates the main image on the page.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}