package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gameItem extends PropertyDef(
        iri = "http://schema.org/gameItem",
        iris = Set("http://schema.org/gameItem"),
        label = "gameItem",
        comment = """An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}