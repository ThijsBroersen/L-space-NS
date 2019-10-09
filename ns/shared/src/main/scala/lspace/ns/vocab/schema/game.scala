package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object game extends PropertyDef(
        iri = "http://schema.org/game",
        iris = Set("http://schema.org/game"),
        label = "game",
        comment = """Video game which is played on this server.""",
        `@extends` = List(),
        `@range` = List(VideoGame.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}