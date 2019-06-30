package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object connectedTo extends PropertyDef(
        iri = "http://schema.org/connectedTo",
        iris = Set("http://schema.org/connectedTo"),
        label = "connectedTo",
        comment = """Other anatomical structures to which this structure is connected.""",
        `@extends` = () => List(),
        `@range` = () => List(AnatomicalStructure.ontology)
       ){
}