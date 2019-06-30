package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object supportingData extends PropertyDef(
        iri = "http://schema.org/supportingData",
        iris = Set("http://schema.org/supportingData"),
        label = "supportingData",
        comment = """Supporting data for a SoftwareApplication.""",
        `@extends` = () => List(),
        `@range` = () => List(DataFeed.ontology)
       ){
}