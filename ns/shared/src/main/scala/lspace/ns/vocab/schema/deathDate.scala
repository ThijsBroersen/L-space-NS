package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object deathDate extends PropertyDef(
        iri = "https://schema.org/deathDate",
        iris = Set("https://schema.org/deathDate"),
        label = "deathDate",
        comment = """Date of death.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}