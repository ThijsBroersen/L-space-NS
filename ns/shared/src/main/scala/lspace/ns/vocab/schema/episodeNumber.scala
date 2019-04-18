package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object episodeNumber extends PropertyDef(
        iri = "http://schema.org/episodeNumber",
        iris = Set("http://schema.org/episodeNumber"),
        label = "episodeNumber",
        comment = """Position of the episode within an ordered group of episodes.""",
        `@extends` = () => List(position.property),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.position.Properties
}