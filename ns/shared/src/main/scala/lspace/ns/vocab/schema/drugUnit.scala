package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object drugUnit extends PropertyDef(
        iri = "http://schema.org/drugUnit",
        iris = Set("http://schema.org/drugUnit"),
        label = "drugUnit",
        comment = """The unit in which the drug is measured, e.g. '5 mg tablet'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}