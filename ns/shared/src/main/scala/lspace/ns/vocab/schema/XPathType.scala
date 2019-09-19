package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object XPathType extends OntologyDef(
        iri = "http://schema.org/XPathType",
        iris = Set("http://schema.org/XPathType"),
        label = "XPathType",
        comment = """Text representing an XPath (typically but not necessarily version 1.0).""",
        `@extends` = () => List(Text.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Text.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Text.Properties{

}
}