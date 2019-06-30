package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object downloadUrl extends PropertyDef(
        iri = "http://schema.org/downloadUrl",
        iris = Set("http://schema.org/downloadUrl"),
        label = "downloadUrl",
        comment = """If the file can be downloaded, URL to download the binary.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){
}