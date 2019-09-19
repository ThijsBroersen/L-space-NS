package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Episode extends OntologyDef(
        iri = "http://schema.org/Episode",
        iris = Set("http://schema.org/Episode"),
        label = "Episode",
        comment = """A media episode (e.g. TV, radio, video game) which can be part of a series or season.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episodeNumber = lspace.ns.vocab.schema.episodeNumber.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val partOfSeason = lspace.ns.vocab.schema.partOfSeason.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
override lazy val properties: List[LProperty] = List(actor, director, episodeNumber, musicBy, partOfSeason, partOfSeries, productionCompany, trailer)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val episodeNumber = lspace.ns.vocab.schema.episodeNumber.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val partOfSeason = lspace.ns.vocab.schema.partOfSeason.property
lazy val partOfSeries = lspace.ns.vocab.schema.partOfSeries.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
}