package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object worksFor extends PropertyDef(
        iri = "https://schema.org/worksFor",
        iris = Set("https://schema.org/worksFor"),
        label = "worksFor",
        comment = """Organizations that the person works for.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}