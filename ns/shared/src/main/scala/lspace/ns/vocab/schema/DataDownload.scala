package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DataDownload extends OntologyDef(
        iri = "http://schema.org/DataDownload",
        iris = Set("http://schema.org/DataDownload"),
        label = "DataDownload",
        comment = """A dataset in downloadable form.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
}