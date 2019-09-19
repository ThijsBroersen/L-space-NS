package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object tissueSample extends PropertyDef(
        iri = "http://schema.org/tissueSample",
        iris = Set("http://schema.org/tissueSample"),
        label = "tissueSample",
        comment = """The type of tissue sample required for the test.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}