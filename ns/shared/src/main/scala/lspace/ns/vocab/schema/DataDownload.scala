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
object keys extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
override lazy val properties: List[LProperty] = List(measurementTechnique)
trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val measurementTechnique = lspace.ns.vocab.schema.measurementTechnique.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
}