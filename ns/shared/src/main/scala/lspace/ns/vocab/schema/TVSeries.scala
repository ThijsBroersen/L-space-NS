package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TVSeries extends OntologyDef(
        iri = "http://schema.org/TVSeries",
        iris = Set("http://schema.org/TVSeries"),
        label = "TVSeries",
        comment = """CreativeWorkSeries dedicated to TV broadcast and associated online delivery.""",
        `@extends` = () => List(CreativeWorkSeries.ontology, CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val actors = lspace.ns.vocab.schema.actors.property
}
override lazy val properties: List[LProperty] = List(episode, actors)
trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeries.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val episode = lspace.ns.vocab.schema.episode.property
lazy val actors = lspace.ns.vocab.schema.actors.property
}
}