package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object activityFrequency extends PropertyDef(
        iri = "http://schema.org/activityFrequency",
        iris = Set("http://schema.org/activityFrequency"),
        label = "activityFrequency",
        comment = """How often one should engage in the activity.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}