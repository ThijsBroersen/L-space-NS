package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TipAction extends OntologyDef(
        iri = "http://schema.org/TipAction",
        iris = Set("http://schema.org/TipAction"),
        label = "TipAction",
        comment = """The act of giving money voluntarily to a beneficiary in recognition of services rendered.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TradeAction.Properties{
lazy val recipient = lspace.ns.vocab.schema.recipient.property
}
override lazy val properties: List[LProperty] = List(recipient)
trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties{
lazy val recipient = lspace.ns.vocab.schema.recipient.property
}
}