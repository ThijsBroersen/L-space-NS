package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryGrant extends OntologyDef(
        iri = "http://schema.org/MonetaryGrant",
        iris = Set("http://schema.org/MonetaryGrant"),
        label = "MonetaryGrant",
        comment = """A monetary grant.""",
        `@extends` = () => List(Grant.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Grant.Properties{
lazy val amount = lspace.ns.vocab.schema.amount.property
lazy val funder = lspace.ns.vocab.schema.funder.property
}
override lazy val properties: List[LProperty] = List(amount, funder)
trait Properties extends lspace.ns.vocab.schema.Grant.Properties{
lazy val amount = lspace.ns.vocab.schema.amount.property
lazy val funder = lspace.ns.vocab.schema.funder.property
}
}