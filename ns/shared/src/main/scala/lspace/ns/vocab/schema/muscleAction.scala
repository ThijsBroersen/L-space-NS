package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object muscleAction extends PropertyDef(
        iri = "http://schema.org/muscleAction",
        iris = Set("http://schema.org/muscleAction"),
        label = "muscleAction",
        comment = """The movement the muscle generates.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}