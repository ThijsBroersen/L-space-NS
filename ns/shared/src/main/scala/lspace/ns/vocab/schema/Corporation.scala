package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Corporation extends OntologyDef(
        iri = "http://schema.org/Corporation",
        iris = Set("http://schema.org/Corporation"),
        label = "Corporation",
        comment = """Organization: A business corporation.""",
        `@extends` = () => List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{
lazy val tickerSymbol = lspace.ns.vocab.schema.tickerSymbol.property
}
override lazy val properties: List[LProperty] = List(tickerSymbol)
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{
lazy val tickerSymbol = lspace.ns.vocab.schema.tickerSymbol.property
}
}