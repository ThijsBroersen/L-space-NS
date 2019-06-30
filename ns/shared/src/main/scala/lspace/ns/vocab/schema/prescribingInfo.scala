package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object prescribingInfo extends PropertyDef(
        iri = "http://schema.org/prescribingInfo",
        iris = Set("http://schema.org/prescribingInfo"),
        label = "prescribingInfo",
        comment = """Link to prescribing information for the drug.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){
}