package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetPopulation extends PropertyDef(
        iri = "http://schema.org/targetPopulation",
        iris = Set("http://schema.org/targetPopulation"),
        label = "targetPopulation",
        comment = """Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}