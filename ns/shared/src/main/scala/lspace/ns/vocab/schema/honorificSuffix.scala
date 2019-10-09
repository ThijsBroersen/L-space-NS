package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object honorificSuffix extends PropertyDef(
        iri = "http://schema.org/honorificSuffix",
        iris = Set("http://schema.org/honorificSuffix"),
        label = "honorificSuffix",
        comment = """An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}