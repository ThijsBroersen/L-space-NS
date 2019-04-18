package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object percentile90 extends PropertyDef(
        iri = "http://schema.org/percentile90",
        iris = Set("http://schema.org/percentile90"),
        label = "percentile90",
        comment = """The 90th percentile value.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}