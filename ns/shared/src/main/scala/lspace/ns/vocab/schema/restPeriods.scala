package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object restPeriods extends PropertyDef(
        iri = "http://schema.org/restPeriods",
        iris = Set("http://schema.org/restPeriods"),
        label = "restPeriods",
        comment = """How often one should break from the activity.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}