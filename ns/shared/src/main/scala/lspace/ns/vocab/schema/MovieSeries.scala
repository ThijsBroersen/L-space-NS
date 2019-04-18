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
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
override lazy val properties: List[LProperty] = List(musicBy, directors, actors, director, productionCompany)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties{
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
}