package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TVEpisode extends OntologyDef(
        iri = "http://schema.org/TVEpisode",
        iris = Set("http://schema.org/TVEpisode"),
        label = "TVEpisode",
        comment = """A TV episode which can be part of a series or season.""",
        `@extends` = () => List(Episode.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Episode.Properties{
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
}
override lazy val properties: List[LProperty] = List(countryOfOrigin, subtitleLanguage)
trait Properties extends lspace.ns.vocab.schema.Episode.Properties{
lazy val countryOfOrigin = lspace.ns.vocab.schema.countryOfOrigin.property
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
}
}