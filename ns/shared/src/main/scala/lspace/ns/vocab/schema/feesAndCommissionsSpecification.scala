package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object feesAndCommissionsSpecification extends PropertyDef(
        iri = "http://schema.org/feesAndCommissionsSpecification",
        iris = Set("http://schema.org/feesAndCommissionsSpecification"),
        label = "feesAndCommissionsSpecification",
        comment = """Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}