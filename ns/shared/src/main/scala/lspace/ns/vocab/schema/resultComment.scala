package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object resultComment extends PropertyDef(
        iri = "http://schema.org/resultComment",
        iris = Set("http://schema.org/resultComment"),
        label = "resultComment",
        comment = """A sub property of result. The Comment created or sent as a result of this action.""",
        `@extends` = () => List(result.property),
        `@range` = () => List(Comment.ontology)
       ){
}