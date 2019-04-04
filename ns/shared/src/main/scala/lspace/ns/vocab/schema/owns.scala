package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object owns extends PropertyDef(
        iri = "https://schema.org/owns",
        iris = Set("https://schema.org/owns"),
        label = "owns",
        comment = """Products owned by the organization or person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}