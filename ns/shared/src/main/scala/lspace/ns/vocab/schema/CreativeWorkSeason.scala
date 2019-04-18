package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CreativeWorkSeason
    extends OntologyDef(
      iri = "http://schema.org/CreativeWorkSeason",
      iris = Set("http://schema.org/CreativeWorkSeason"),
      label = "CreativeWorkSeason",
      comment = """A media season e.g. tv, radio, video game etc.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val seasonNumber      = lspace.ns.vocab.schema.seasonNumber.property
    lazy val episode           = lspace.ns.vocab.schema.episode.property
    lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
  }
  override lazy val properties: List[Property] = List(seasonNumber, episode, productionCompany)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val seasonNumber      = lspace.ns.vocab.schema.seasonNumber.property
    lazy val episode           = lspace.ns.vocab.schema.episode.property
    lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
  }
}
