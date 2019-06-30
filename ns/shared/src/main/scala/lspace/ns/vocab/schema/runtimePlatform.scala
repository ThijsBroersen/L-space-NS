package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object runtimePlatform extends PropertyDef(
        iri = "http://schema.org/runtimePlatform",
        iris = Set("http://schema.org/runtimePlatform"),
        label = "runtimePlatform",
        comment = """Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}