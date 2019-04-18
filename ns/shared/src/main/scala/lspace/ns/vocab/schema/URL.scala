package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object URL extends OntologyDef(
        iri = "http://schema.org/URL",
        iris = Set("http://schema.org/URL"),
        label = "URL",
        comment = """Data type: URL.""",
        `@extends` = () => List(Text.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Text.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Text.Properties{

}
}