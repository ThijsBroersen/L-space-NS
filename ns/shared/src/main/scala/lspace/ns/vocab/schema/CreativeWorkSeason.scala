package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CreativeWorkSeason extends OntologyDef(
        iri = "http://schema.org/CreativeWorkSeason",
        iris = Set("http://schema.org/CreativeWorkSeason"),
        label = "CreativeWorkSeason",
        comment = """A media season e.g. tv, radio, video game etc.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}