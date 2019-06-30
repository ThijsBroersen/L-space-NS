package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object requirements extends PropertyDef(
        iri = "http://schema.org/requirements",
        iris = Set("http://schema.org/requirements"),
        label = "requirements",
        comment = """Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){
}