package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object deathDate extends PropertyDef(
        iri = "http://schema.org/deathDate",
        iris = Set("http://schema.org/deathDate"),
        label = "deathDate",
        comment = """Date of death.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}