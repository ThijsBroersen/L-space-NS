package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accountId extends PropertyDef(
        iri = "http://schema.org/accountId",
        iris = Set("http://schema.org/accountId"),
        label = "accountId",
        comment = """The identifier for the account the payment will be applied to.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}