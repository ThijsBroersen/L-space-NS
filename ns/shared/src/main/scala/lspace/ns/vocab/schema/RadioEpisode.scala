package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadioEpisode extends OntologyDef(
        iri = "http://schema.org/RadioEpisode",
        iris = Set("http://schema.org/RadioEpisode"),
        label = "RadioEpisode",
        comment = """A radio episode which can be part of a series or season.""",
        `@extends` = () => List(Episode.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Episode.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Episode.Properties{

}
}