package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object competencyRequired extends PropertyDef(
        iri = "http://schema.org/competencyRequired",
        iris = Set("http://schema.org/competencyRequired"),
        label = "competencyRequired",
        comment = """Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology, DefinedTerm.ontology)
       ){
}