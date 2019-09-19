package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MovieSeries extends OntologyDef(
        iri = "http://schema.org/MovieSeries",
        iris = Set("http://schema.org/MovieSeries"),
        label = "MovieSeries",
        comment = """A series of movies. Included movies can be indicated with the hasPart property.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
override lazy val properties: List[LProperty] = List(actor, director, musicBy, productionCompany, trailer)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val trailer = lspace.ns.vocab.schema.trailer.property
}
}