package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CheckoutPage extends OntologyDef(
        iri = "http://schema.org/CheckoutPage",
        iris = Set("http://schema.org/CheckoutPage"),
        label = "CheckoutPage",
        comment = """Web page type: Checkout page.""",
        `@extends` = () => List(WebPage.ontology)
       ){
object keys extends lspace.ns.vocab.schema.WebPage.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.WebPage.Properties{

}
}