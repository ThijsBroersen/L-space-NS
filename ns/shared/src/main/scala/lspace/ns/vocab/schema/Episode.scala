package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Episode extends OntologyDef(
        iri = "http://schema.org/Episode",
        iris = Set("http://schema.org/Episode"),
        label = "Episode",
        comment = """A media episode (e.g. TV, radio, video game) which can be part of a series or season.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}