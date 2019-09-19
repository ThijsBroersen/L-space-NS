package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seatingCapacity extends PropertyDef(
        iri = "http://schema.org/seatingCapacity",
        iris = Set("http://schema.org/seatingCapacity"),
        label = "seatingCapacity",
        comment = """The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.<br/><br/>

Typical unit code(s): C62 for persons""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}