package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object memoryRequirements extends PropertyDef(
        iri = "http://schema.org/memoryRequirements",
        iris = Set("http://schema.org/memoryRequirements"),
        label = "memoryRequirements",
        comment = """Minimum memory requirements.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology)
       ){
}