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
}