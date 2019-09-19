package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seasonNumber extends PropertyDef(
        iri = "http://schema.org/seasonNumber",
        iris = Set("http://schema.org/seasonNumber"),
        label = "seasonNumber",
        comment = """Position of the season within an ordered group of seasons.""",
        `@extends` = () => List(position.property),
        `@range` = () => List(`@int`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.position.Properties
}