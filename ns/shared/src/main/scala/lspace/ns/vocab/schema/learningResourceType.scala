package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object learningResourceType extends PropertyDef(
        iri = "http://schema.org/learningResourceType",
        iris = Set("http://schema.org/learningResourceType"),
        label = "learningResourceType",
        comment = """The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}