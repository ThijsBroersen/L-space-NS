package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoGameSeries extends OntologyDef(
        iri = "http://schema.org/VideoGameSeries",
        iris = Set("http://schema.org/VideoGameSeries"),
        label = "VideoGameSeries",
        comment = """A video game series.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val cheatCode = lspace.ns.vocab.schema.cheatCode.property
lazy val containsSeason = lspace.ns.vocab.schema.containsSeason.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val gameItem = lspace.ns.vocab.schema.gameItem.property
lazy val gameLocation = lspace.ns.vocab.schema.gameLocation.property
lazy val gamePlatform = lspace.ns.vocab.schema.gamePlatform.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val numberOfSeasons = lspace.ns.vocab.schema.numberOfSeasons.property
lazy val playMode = lspace.ns.vocab.schema.playMode.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val quest = lspace.ns.vocab.schema.quest.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
override lazy val properties: List[LProperty] = List(actor, characterAttribute, cheatCode, containsSeason, director, episode, gameItem, gameLocation, gamePlatform, musicBy, numberOfEpisodes, numberOfPlayers, numberOfSeasons, playMode, productionCompany, quest, trailer)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val cheatCode = lspace.ns.vocab.schema.cheatCode.property
lazy val containsSeason = lspace.ns.vocab.schema.containsSeason.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val gameItem = lspace.ns.vocab.schema.gameItem.property
lazy val gameLocation = lspace.ns.vocab.schema.gameLocation.property
lazy val gamePlatform = lspace.ns.vocab.schema.gamePlatform.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val numberOfSeasons = lspace.ns.vocab.schema.numberOfSeasons.property
lazy val playMode = lspace.ns.vocab.schema.playMode.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val quest = lspace.ns.vocab.schema.quest.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
}