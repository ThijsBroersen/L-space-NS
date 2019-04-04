package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object audio extends PropertyDef(
        iri = "https://schema.org/audio",
        iris = Set("https://schema.org/audio"),
        label = "audio",
        comment = """An embedded audio object.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}