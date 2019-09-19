package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object firstPerformance extends PropertyDef(
        iri = "http://schema.org/firstPerformance",
        iris = Set("http://schema.org/firstPerformance"),
        label = "firstPerformance",
        comment = """The date and place the work was first performed.""",
        `@extends` = () => List(),
        `@range` = () => List(Event.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}