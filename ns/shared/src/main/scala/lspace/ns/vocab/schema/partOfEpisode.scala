package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfEpisode extends PropertyDef(
        iri = "http://schema.org/partOfEpisode",
        iris = Set("http://schema.org/partOfEpisode"),
        label = "partOfEpisode",
        comment = """The episode to which this clip belongs.""",
        `@extends` = () => List(isPartOf.property),
        `@range` = () => List(Episode.ontology)
       ){
}