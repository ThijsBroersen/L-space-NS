package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object colleagues extends PropertyDef(
        iri = "https://schema.org/colleagues",
        iris = Set("https://schema.org/colleagues"),
        label = "colleagues",
        comment = """A colleague of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}