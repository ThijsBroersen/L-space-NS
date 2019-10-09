package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TVSeries extends OntologyDef(
        iri = "http://schema.org/TVSeries",
        iris = Set("http://schema.org/TVSeries"),
        label = "TVSeries",
        comment = """CreativeWorkSeries dedicated to TV broadcast and associated online delivery.""",
        `@extends` = List(CreativeWorkSeries.ontology, CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val containsSeason = lspace.ns.vocab.schema.containsSeason.property
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val numberOfSeasons = lspace.ns.vocab.schema.numberOfSeasons.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
override lazy val properties: List[LProperty] = List(actor, containsSeason, countryOfOrigin, director, episode, musicBy, numberOfEpisodes, numberOfSeasons, productionCompany, trailer)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val containsSeason = lspace.ns.vocab.schema.containsSeason.property
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val numberOfEpisodes = lspace.ns.vocab.schema.numberOfEpisodes.property
lazy val numberOfSeasons = lspace.ns.vocab.schema.numberOfSeasons.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
}