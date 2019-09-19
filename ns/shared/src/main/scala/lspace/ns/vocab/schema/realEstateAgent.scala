package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object realEstateAgent extends PropertyDef(
        iri = "http://schema.org/realEstateAgent",
        iris = Set("http://schema.org/realEstateAgent"),
        label = "realEstateAgent",
        comment = """A sub property of participant. The real estate agent involved in the action.""",
        `@extends` = () => List(participant.property),
        `@range` = () => List(RealEstateAgent.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.participant.Properties
}