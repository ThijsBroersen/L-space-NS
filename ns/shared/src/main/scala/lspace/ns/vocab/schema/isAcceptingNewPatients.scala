package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isAcceptingNewPatients extends PropertyDef(
        iri = "http://schema.org/isAcceptingNewPatients",
        iris = Set("http://schema.org/isAcceptingNewPatients"),
        label = "isAcceptingNewPatients",
        comment = """Whether the provider is accepting new patients.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}