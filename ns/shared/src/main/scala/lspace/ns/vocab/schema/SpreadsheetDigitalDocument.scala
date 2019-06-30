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
}