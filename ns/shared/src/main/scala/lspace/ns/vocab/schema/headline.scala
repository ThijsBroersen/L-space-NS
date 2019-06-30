package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object headline extends PropertyDef(
        iri = "http://schema.org/headline",
        iris = Set("http://schema.org/headline"),
        label = "headline",
        comment = """Headline of the article.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, Text.ontology)
       ){
}