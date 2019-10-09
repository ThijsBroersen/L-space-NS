package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastAffiliateOf extends PropertyDef(
        iri = "http://schema.org/broadcastAffiliateOf",
        iris = Set("http://schema.org/broadcastAffiliateOf"),
        label = "broadcastAffiliateOf",
        comment = """The media network(s) whose content is broadcast on this station.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}