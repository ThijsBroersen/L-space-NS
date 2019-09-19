package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Game extends OntologyDef(
        iri = "http://schema.org/Game",
        iris = Set("http://schema.org/Game"),
        label = "Game",
        comment = """The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val gameItem = lspace.ns.vocab.schema.gameItem.property
lazy val gameLocation = lspace.ns.vocab.schema.gameLocation.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val quest = lspace.ns.vocab.schema.quest.property
}
override lazy val properties: List[LProperty] = List(characterAttribute, gameItem, gameLocation, numberOfPlayers, quest)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val gameItem = lspace.ns.vocab.schema.gameItem.property
lazy val gameLocation = lspace.ns.vocab.schema.gameLocation.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val quest = lspace.ns.vocab.schema.quest.property
}
}