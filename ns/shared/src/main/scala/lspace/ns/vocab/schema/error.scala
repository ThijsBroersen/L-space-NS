package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object error extends PropertyDef(
        iri = "http://schema.org/error",
        iris = Set("http://schema.org/error"),
        label = "error",
        comment = """For failed actions, more information on the cause of the failure.""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology)
       ){
}