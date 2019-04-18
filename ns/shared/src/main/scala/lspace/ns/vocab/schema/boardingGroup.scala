package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object boardingGroup extends PropertyDef(
        iri = "http://schema.org/boardingGroup",
        iris = Set("http://schema.org/boardingGroup"),
        label = "boardingGroup",
        comment = """The airline-specific indicator of boarding order / preference.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}