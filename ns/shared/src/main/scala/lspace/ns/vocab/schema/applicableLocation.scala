package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object applicableLocation extends PropertyDef(
        iri = "http://schema.org/applicableLocation",
        iris = Set("http://schema.org/applicableLocation"),
        label = "applicableLocation",
        comment = """The location in which the status applies.""",
        `@extends` = () => List(),
        `@range` = () => List(AdministrativeArea.ontology)
       ){
}