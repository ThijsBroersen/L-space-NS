package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RadioSeries
    extends OntologyDef(
      iri = "http://schema.org/RadioSeries",
      iris = Set("http://schema.org/RadioSeries"),
      label = "RadioSeries",
      comment = """CreativeWorkSeries dedicated to radio broadcast and associated online delivery.""",
      `@extends` = () => List(CreativeWorkSeries.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties {
    lazy val episode           = lspace.ns.vocab.schema.episode.property
    lazy val numberOfSeasons   = lspace.ns.vocab.schema.numberOfSeasons.property
    lazy val actors            = lspace.ns.vocab.schema.actors.property
    lazy val director          = lspace.ns.vocab.schema.director.property
    lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
  }
  override lazy val properties: List[Property] = List(episode, numberOfSeasons, actors, director, productionCompany)
  trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties {
    lazy val episode           = lspace.ns.vocab.schema.episode.property
    lazy val numberOfSeasons   = lspace.ns.vocab.schema.numberOfSeasons.property
    lazy val actors            = lspace.ns.vocab.schema.actors.property
    lazy val director          = lspace.ns.vocab.schema.director.property
    lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
  }
}
