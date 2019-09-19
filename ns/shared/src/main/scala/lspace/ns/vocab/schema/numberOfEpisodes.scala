package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfEpisodes extends PropertyDef(
        iri = "http://schema.org/numberOfEpisodes",
        iris = Set("http://schema.org/numberOfEpisodes"),
        label = "numberOfEpisodes",
        comment = """The number of episodes in this season or series.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}