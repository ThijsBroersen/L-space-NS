package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfEmployees extends PropertyDef(
        iri = "http://schema.org/numberOfEmployees",
        iris = Set("http://schema.org/numberOfEmployees"),
        label = "numberOfEmployees",
        comment = """The number of employees in an organization e.g. business.""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}