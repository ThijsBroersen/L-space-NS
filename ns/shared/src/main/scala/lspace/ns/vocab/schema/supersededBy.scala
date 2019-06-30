package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object supersededBy extends PropertyDef(
        iri = "http://schema.org/supersededBy",
        iris = Set("http://schema.org/supersededBy"),
        label = "supersededBy",
        comment = """Relates a term (i.e. a property, class or enumeration) to one that supersedes it.""",
        `@extends` = () => List(),
        `@range` = () => List(`@class`, `@property`, Enumeration.ontology)
       ){
}