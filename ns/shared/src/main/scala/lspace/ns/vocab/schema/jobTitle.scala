package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object jobTitle extends PropertyDef(
        iri = "http://schema.org/jobTitle",
        iris = Set("http://schema.org/jobTitle"),
        label = "jobTitle",
        comment = """The job title of the person (for example, Financial Manager).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}