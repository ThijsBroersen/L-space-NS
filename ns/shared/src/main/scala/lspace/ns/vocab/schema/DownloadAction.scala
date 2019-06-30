package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DownloadAction extends OntologyDef(
        iri = "http://schema.org/DownloadAction",
        iris = Set("http://schema.org/DownloadAction"),
        label = "DownloadAction",
        comment = """The act of downloading an object.""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}