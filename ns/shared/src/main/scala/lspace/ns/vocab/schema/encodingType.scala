package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object encodingType extends PropertyDef(
        iri = "http://schema.org/encodingType",
        iris = Set("http://schema.org/encodingType"),
        label = "encodingType",
        comment = """The supported encoding type(s) for an EntryPoint request.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}