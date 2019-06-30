package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TVSeason extends OntologyDef(
        iri = "http://schema.org/TVSeason",
        iris = Set("http://schema.org/TVSeason"),
        label = "TVSeason",
        comment = """Season dedicated to TV broadcast and associated online delivery.""",
        `@extends` = () => List(CreativeWork.ontology, CreativeWorkSeason.ontology)
       ){
}