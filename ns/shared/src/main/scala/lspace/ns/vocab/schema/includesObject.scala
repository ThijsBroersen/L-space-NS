package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includesObject extends PropertyDef(
        iri = "http://schema.org/includesObject",
        iris = Set("http://schema.org/includesObject"),
        label = "includesObject",
        comment = """This links to a node or nodes indicating the exact quantity of the products included in the offer.""",
        `@extends` = () => List(),
        `@range` = () => List(TypeAndQuantityNode.ontology)
       ){
}