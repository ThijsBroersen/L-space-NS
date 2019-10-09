package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object authenticator extends PropertyDef(
        iri = "http://schema.org/authenticator",
        iris = Set("http://schema.org/authenticator"),
        label = "authenticator",
        comment = """The Organization responsible for authenticating the user's subscription. For example, many media apps require a cable/satellite provider to authenticate your subscription before playing media.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}