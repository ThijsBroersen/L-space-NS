package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object costOrigin extends PropertyDef(
        iri = "http://schema.org/costOrigin",
        iris = Set("http://schema.org/costOrigin"),
        label = "costOrigin",
        comment = """Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}