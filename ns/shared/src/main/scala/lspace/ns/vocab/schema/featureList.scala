package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object featureList extends PropertyDef(
        iri = "http://schema.org/featureList",
        iris = Set("http://schema.org/featureList"),
        label = "featureList",
        comment = """Features or modules provided by this application (and possibly required by other applications).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology)
       ){
}