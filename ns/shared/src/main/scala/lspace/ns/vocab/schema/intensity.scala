package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object intensity extends PropertyDef(
        iri = "http://schema.org/intensity",
        iris = Set("http://schema.org/intensity"),
        label = "intensity",
        comment = """Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}