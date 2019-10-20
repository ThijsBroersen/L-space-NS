package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pageStart extends PropertyDef(
        iri = "http://schema.org/pageStart",
        iris = Set("http://schema.org/pageStart"),
        label = "pageStart",
        comment = """The page on which the work starts; for example "135" or "xiii".""",
        `@extends` = List(),
        `@range` = List(`@int`, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}