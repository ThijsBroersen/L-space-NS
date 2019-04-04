package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object deathPlace extends PropertyDef(
        iri = "https://schema.org/deathPlace",
        iris = Set("https://schema.org/deathPlace"),
        label = "deathPlace",
        comment = """The place where the person died.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}