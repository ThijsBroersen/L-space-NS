package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WPHeader extends OntologyDef(
        iri = "http://schema.org/WPHeader",
        iris = Set("http://schema.org/WPHeader"),
        label = "WPHeader",
        comment = """The header section of the page.""",
        `@extends` = () => List(WebPageElement.ontology)
       ){
object keys extends lspace.ns.vocab.schema.WebPageElement.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.WebPageElement.Properties{

}
}