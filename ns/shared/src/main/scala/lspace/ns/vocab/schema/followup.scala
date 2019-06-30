package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object followup extends PropertyDef(
        iri = "http://schema.org/followup",
        iris = Set("http://schema.org/followup"),
        label = "followup",
        comment = """Typical or recommended followup care after the procedure is performed.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}