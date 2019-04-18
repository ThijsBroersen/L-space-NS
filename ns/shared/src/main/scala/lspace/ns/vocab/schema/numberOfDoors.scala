package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfDoors extends PropertyDef(
        iri = "http://schema.org/numberOfDoors",
        iris = Set("http://schema.org/numberOfDoors"),
        label = "numberOfDoors",
        comment = """The number of doors.<br/><br/>

Typical unit code(s): C62""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}