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
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val quest = lspace.ns.vocab.schema.quest.property
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
override lazy val properties: List[LProperty] = List(episode, actors, numberOfPlayers, quest, characterAttribute, productionCompany)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val numberOfPlayers = lspace.ns.vocab.schema.numberOfPlayers.property
lazy val quest = lspace.ns.vocab.schema.quest.property
lazy val characterAttribute = lspace.ns.vocab.schema.characterAttribute.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
}