package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object codeSampleType extends PropertyDef(
        iri = "http://schema.org/codeSampleType",
        iris = Set("http://schema.org/codeSampleType"),
        label = "codeSampleType",
        comment = """What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}