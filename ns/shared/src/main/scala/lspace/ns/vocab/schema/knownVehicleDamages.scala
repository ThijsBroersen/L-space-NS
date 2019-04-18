package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object knownVehicleDamages extends PropertyDef(
        iri = "http://schema.org/knownVehicleDamages",
        iris = Set("http://schema.org/knownVehicleDamages"),
        label = "knownVehicleDamages",
        comment = """A textual description of known damages, both repaired and unrepaired.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}