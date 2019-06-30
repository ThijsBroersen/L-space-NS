package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pregnancyWarning extends PropertyDef(
        iri = "http://schema.org/pregnancyWarning",
        iris = Set("http://schema.org/pregnancyWarning"),
        label = "pregnancyWarning",
        comment = """Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}