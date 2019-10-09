package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bookFormat extends PropertyDef(
        iri = "http://schema.org/bookFormat",
        iris = Set("http://schema.org/bookFormat"),
        label = "bookFormat",
        comment = """The format of the book.""",
        `@extends` = List(),
        `@range` = List(BookFormatType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}