package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object honorificSuffix extends PropertyDef(
        iri = "https://schema.org/honorificSuffix",
        iris = Set("https://schema.org/honorificSuffix"),
        label = "honorificSuffix",
        comment = """An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}