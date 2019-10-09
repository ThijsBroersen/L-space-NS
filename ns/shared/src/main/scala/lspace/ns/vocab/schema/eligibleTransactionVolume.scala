package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object eligibleTransactionVolume extends PropertyDef(
        iri = "http://schema.org/eligibleTransactionVolume",
        iris = Set("http://schema.org/eligibleTransactionVolume"),
        label = "eligibleTransactionVolume",
        comment = """The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.""",
        `@extends` = List(),
        `@range` = List(PriceSpecification.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}