package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object containsSeason extends PropertyDef(
        iri = "http://schema.org/containsSeason",
        iris = Set("http://schema.org/containsSeason"),
        label = "containsSeason",
        comment = """A season that is part of the media series.""",
        `@extends` = () => List(hasPart.property),
        `@range` = () => List(CreativeWorkSeason.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.hasPart.Properties
}