package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MediaSubscription extends OntologyDef(
        iri = "http://schema.org/MediaSubscription",
        iris = Set("http://schema.org/MediaSubscription"),
        label = "MediaSubscription",
        comment = """A subscription which allows a user to access media including audio, video, books, etc.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val authenticator = lspace.ns.vocab.schema.authenticator.property
lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
}
override lazy val properties: List[LProperty] = List(authenticator, expectsAcceptanceOf)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val authenticator = lspace.ns.vocab.schema.authenticator.property
lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
}
}