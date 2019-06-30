package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadioSeries extends OntologyDef(
        iri = "http://schema.org/RadioSeries",
        iris = Set("http://schema.org/RadioSeries"),
        label = "RadioSeries",
        comment = """CreativeWorkSeries dedicated to radio broadcast and associated online delivery.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
}