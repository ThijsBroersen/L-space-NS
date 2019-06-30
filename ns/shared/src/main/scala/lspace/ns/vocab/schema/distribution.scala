package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object distribution extends PropertyDef(
        iri = "http://schema.org/distribution",
        iris = Set("http://schema.org/distribution"),
        label = "distribution",
        comment = """A downloadable form of this dataset, at a specific location, in a specific format.""",
        `@extends` = () => List(),
        `@range` = () => List(DataDownload.ontology)
       ){
}