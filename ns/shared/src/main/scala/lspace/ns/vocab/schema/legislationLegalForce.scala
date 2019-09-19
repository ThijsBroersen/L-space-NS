package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationLegalForce extends PropertyDef(
        iri = "http://schema.org/legislationLegalForce",
        iris = Set("http://schema.org/legislationLegalForce"),
        label = "legislationLegalForce",
        comment = """Whether the legislation is currently in force, not in force, or partially in force.""",
        `@extends` = () => List(),
        `@range` = () => List(LegalForceStatus.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}