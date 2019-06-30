package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object guidelineDate extends PropertyDef(
        iri = "http://schema.org/guidelineDate",
        iris = Set("http://schema.org/guidelineDate"),
        label = "guidelineDate",
        comment = """Date on which this guideline's recommendation was made.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}