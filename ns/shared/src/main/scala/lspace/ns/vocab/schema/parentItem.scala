package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object parentItem extends PropertyDef(
        iri = "http://schema.org/parentItem",
        iris = Set("http://schema.org/parentItem"),
        label = "parentItem",
        comment = """The parent of a question, answer or item in general.""",
        `@extends` = () => List(),
        `@range` = () => List(Question.ontology)
       ){
}