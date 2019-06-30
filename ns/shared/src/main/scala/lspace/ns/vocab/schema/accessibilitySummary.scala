package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accessibilitySummary extends PropertyDef(
        iri = "http://schema.org/accessibilitySummary",
        iris = Set("http://schema.org/accessibilitySummary"),
        label = "accessibilitySummary",
        comment = """A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as "short descriptions are present but long descriptions will be needed for non-visual users" or "short descriptions are present and no long descriptions are needed."""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}