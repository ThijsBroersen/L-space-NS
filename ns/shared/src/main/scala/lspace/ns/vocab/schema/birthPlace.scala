package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object birthPlace extends PropertyDef(
        iri = "https://schema.org/birthPlace",
        iris = Set("https://schema.org/birthPlace"),
        label = "birthPlace",
        comment = """The place where the person was born.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}