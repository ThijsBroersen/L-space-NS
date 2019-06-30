package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object trackingUrl extends PropertyDef(
        iri = "http://schema.org/trackingUrl",
        iris = Set("http://schema.org/trackingUrl"),
        label = "trackingUrl",
        comment = """Tracking url for the parcel delivery.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){
}