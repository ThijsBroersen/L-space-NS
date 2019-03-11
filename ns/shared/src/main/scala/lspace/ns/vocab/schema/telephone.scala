package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object telephone extends PropertyDef(
        iri = "https://schema.org/telephone",
        iris = Set("https://schema.org/telephone"),
        label = "telephone",
        comment = """The telephone number.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}