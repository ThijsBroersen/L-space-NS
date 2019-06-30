package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Season extends OntologyDef(
        iri = "http://schema.org/Season",
        iris = Set("http://schema.org/Season"),
        label = "Season",
        comment = """A media season e.g. tv, radio, video game etc.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}