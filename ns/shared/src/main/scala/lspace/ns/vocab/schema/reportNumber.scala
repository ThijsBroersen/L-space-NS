package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reportNumber extends PropertyDef(
        iri = "http://schema.org/reportNumber",
        iris = Set("http://schema.org/reportNumber"),
        label = "reportNumber",
        comment = """The number or other unique designator assigned to a Report by the publishing organization.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}