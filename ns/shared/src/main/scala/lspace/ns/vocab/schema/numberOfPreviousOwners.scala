package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfPreviousOwners extends PropertyDef(
        iri = "http://schema.org/numberOfPreviousOwners",
        iris = Set("http://schema.org/numberOfPreviousOwners"),
        label = "numberOfPreviousOwners",
        comment = """The number of owners of the vehicle, including the current one.<br/><br/>

Typical unit code(s): C62""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}