package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GameServer extends OntologyDef(
        iri = "http://schema.org/GameServer",
        iris = Set("http://schema.org/GameServer"),
        label = "GameServer",
        comment = """Server that provides game interaction in a multiplayer game.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val game = lspace.ns.vocab.schema.game.property
lazy val playersOnline = lspace.ns.vocab.schema.playersOnline.property
lazy val serverStatus = lspace.ns.vocab.schema.serverStatus.property
}
override lazy val properties: List[LProperty] = List(game, playersOnline, serverStatus)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val game = lspace.ns.vocab.schema.game.property
lazy val playersOnline = lspace.ns.vocab.schema.playersOnline.property
lazy val serverStatus = lspace.ns.vocab.schema.serverStatus.property
}
}