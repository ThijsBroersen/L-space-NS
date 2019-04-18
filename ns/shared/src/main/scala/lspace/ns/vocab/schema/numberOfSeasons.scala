package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfSeasons extends PropertyDef(
        iri = "http://schema.org/numberOfSeasons",
        iris = Set("http://schema.org/numberOfSeasons"),
        label = "numberOfSeasons",
        comment = """The number of seasons in this series.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}