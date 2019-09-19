package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebPageElement extends OntologyDef(
        iri = "http://schema.org/WebPageElement",
        iris = Set("http://schema.org/WebPageElement"),
        label = "WebPageElement",
        comment = """A web page element, like a table or an image.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val cssSelector = lspace.ns.vocab.schema.cssSelector.property
lazy val xpath = lspace.ns.vocab.schema.xpath.property
}
override lazy val properties: List[LProperty] = List(cssSelector, xpath)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val cssSelector = lspace.ns.vocab.schema.cssSelector.property
lazy val xpath = lspace.ns.vocab.schema.xpath.property
}
}