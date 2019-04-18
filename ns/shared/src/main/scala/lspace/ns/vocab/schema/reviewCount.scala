package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reviewCount extends PropertyDef(
        iri = "http://schema.org/reviewCount",
        iris = Set("http://schema.org/reviewCount"),
        label = "reviewCount",
        comment = """The count of total number of reviews.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}