package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nerve extends PropertyDef(
        iri = "http://schema.org/nerve",
        iris = Set("http://schema.org/nerve"),
        label = "nerve",
        comment = """The underlying innervation associated with the muscle.""",
        `@extends` = () => List(),
        `@range` = () => List(Nerve.ontology)
       ){
}