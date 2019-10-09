package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BookFormatType extends OntologyDef(
        iri = "http://schema.org/BookFormatType",
        iris = Set("http://schema.org/BookFormatType"),
        label = "BookFormatType",
        comment = """The publication format of the book.""",
        `@extends` = List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}