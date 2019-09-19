package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Table extends OntologyDef(
        iri = "http://schema.org/Table",
        iris = Set("http://schema.org/Table"),
        label = "Table",
        comment = """A table on a Web page.""",
        `@extends` = () => List(WebPageElement.ontology)
       ){
object keys extends lspace.ns.vocab.schema.WebPageElement.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.WebPageElement.Properties{

}
}