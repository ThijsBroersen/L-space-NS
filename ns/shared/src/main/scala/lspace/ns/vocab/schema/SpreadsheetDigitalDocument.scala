package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SpreadsheetDigitalDocument extends OntologyDef(
        iri = "http://schema.org/SpreadsheetDigitalDocument",
        iris = Set("http://schema.org/SpreadsheetDigitalDocument"),
        label = "SpreadsheetDigitalDocument",
        comment = """A spreadsheet file.""",
        `@extends` = () => List(DigitalDocument.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DigitalDocument.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DigitalDocument.Properties{

}
}