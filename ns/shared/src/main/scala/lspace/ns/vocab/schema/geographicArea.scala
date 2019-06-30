package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geographicArea extends PropertyDef(
        iri = "http://schema.org/geographicArea",
        iris = Set("http://schema.org/geographicArea"),
        label = "geographicArea",
        comment = """The geographic area associated with the audience.""",
        `@extends` = () => List(),
        `@range` = () => List(AdministrativeArea.ontology)
       ){
}