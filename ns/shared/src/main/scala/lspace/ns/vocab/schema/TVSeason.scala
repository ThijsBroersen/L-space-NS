package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TVSeason
    extends OntologyDef(
      iri = "http://schema.org/TVSeason",
      iris = Set("http://schema.org/TVSeason"),
      label = "TVSeason",
      comment = """Season dedicated to TV broadcast and associated online delivery.""",
      `@extends` = () => List(CreativeWork.ontology, CreativeWorkSeason.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.CreativeWork.Properties
      with lspace.ns.vocab.schema.CreativeWorkSeason.Properties {
    lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
    lazy val partOfTVSeries  = lspace.ns.vocab.schema.partOfTVSeries.property
  }
  override lazy val properties: List[LProperty] = List(countryOfOrigin, partOfTVSeries)
  trait Properties
      extends lspace.ns.vocab.schema.CreativeWork.Properties
      with lspace.ns.vocab.schema.CreativeWorkSeason.Properties {
    lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
    lazy val partOfTVSeries  = lspace.ns.vocab.schema.partOfTVSeries.property
  }
}
