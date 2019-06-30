package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object question extends PropertyDef(
        iri = "http://schema.org/question",
        iris = Set("http://schema.org/question"),
        label = "question",
        comment = """A sub property of object. A question.""",
        `@extends` = () => List(`object`.property),
        `@range` = () => List(Question.ontology)
       ){
}