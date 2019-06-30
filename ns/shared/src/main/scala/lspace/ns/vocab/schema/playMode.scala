package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object playMode extends PropertyDef(
        iri = "http://schema.org/playMode",
        iris = Set("http://schema.org/playMode"),
        label = "playMode",
        comment = """Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.""",
        `@extends` = () => List(),
        `@range` = () => List(GamePlayMode.ontology)
       ){
}