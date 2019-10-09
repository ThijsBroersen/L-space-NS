package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Duration extends OntologyDef(
        iri = "http://schema.org/Duration",
        iris = Set("http://schema.org/Duration"),
        label = "Duration",
        comment = """Quantity: Duration (use <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>).""",
        `@extends` = List(Quantity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Quantity.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Quantity.Properties{

}
}