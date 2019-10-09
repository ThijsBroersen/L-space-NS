package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuoteAction extends OntologyDef(
        iri = "http://schema.org/QuoteAction",
        iris = Set("http://schema.org/QuoteAction"),
        label = "QuoteAction",
        comment = """An agent quotes/estimates/appraises an object/product/service with a price at a location/store.""",
        `@extends` = List(TradeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TradeAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties{

}
}