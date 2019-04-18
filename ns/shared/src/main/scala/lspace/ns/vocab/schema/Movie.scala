package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Movie extends OntologyDef(
        iri = "http://schema.org/Movie",
        iris = Set("http://schema.org/Movie"),
        label = "Movie",
        comment = """A movie.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
override lazy val properties: List[LProperty] = List(musicBy, directors, subtitleLanguage, actors, countryOfOrigin, director, duration, productionCompany)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
}
}