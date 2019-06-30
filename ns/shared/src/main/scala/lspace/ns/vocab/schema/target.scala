package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object target extends PropertyDef(
        iri = "http://schema.org/target",
        iris = Set("http://schema.org/target"),
        label = "target",
        comment = """Indicates a target EntryPoint for an Action.""",
        `@extends` = () => List(),
        `@range` = () => List(EntryPoint.ontology)
       ){
}