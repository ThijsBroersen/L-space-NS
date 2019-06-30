package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadioStation extends OntologyDef(
        iri = "http://schema.org/RadioStation",
        iris = Set("http://schema.org/RadioStation"),
        label = "RadioStation",
        comment = """A radio station.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}