package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CreativeWorkSeason extends OntologyDef(
        iri = "http://schema.org/CreativeWorkSeason",
        iris = Set("http://schema.org/CreativeWorkSeason"),
        label = "CreativeWorkSeason",
        comment = """A media season e.g. tv, radio, video game etc.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val seasonNumber = lspace.ns.vocab.schema.seasonNumber.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
override lazy val properties: List[LProperty] = List(actor, director, endDate, episode, numberOfEpisodes, partOfSeries, productionCompany, seasonNumber, startDate, trailer)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val seasonNumber = lspace.ns.vocab.schema.seasonNumber.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
}