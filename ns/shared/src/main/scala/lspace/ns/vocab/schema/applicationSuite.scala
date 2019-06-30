package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object applicationSuite extends PropertyDef(
        iri = "http://schema.org/applicationSuite",
        iris = Set("http://schema.org/applicationSuite"),
        label = "applicationSuite",
        comment = """The name of the application suite to which the application belongs (e.g. Excel belongs to Office).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}