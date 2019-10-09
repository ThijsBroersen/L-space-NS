package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object increasesRiskOf extends PropertyDef(
        iri = "http://schema.org/increasesRiskOf",
        iris = Set("http://schema.org/increasesRiskOf"),
        label = "increasesRiskOf",
        comment = """The condition, complication, etc. influenced by this factor.""",
        `@extends` = List(),
        `@range` = List(MedicalEntity.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}