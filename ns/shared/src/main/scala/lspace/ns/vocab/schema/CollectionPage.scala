package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CollectionPage extends OntologyDef(
        iri = "http://schema.org/CollectionPage",
        iris = Set("http://schema.org/CollectionPage"),
        label = "CollectionPage",
        comment = """Web page type: Collection page.""",
        `@extends` = List(WebPage.ontology)
       ){
object keys extends lspace.ns.vocab.schema.WebPage.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.WebPage.Properties{

}
}