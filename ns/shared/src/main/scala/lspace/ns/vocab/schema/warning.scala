package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object warning extends PropertyDef(
        iri = "http://schema.org/warning",
        iris = Set("http://schema.org/warning"),
        label = "warning",
        comment = """Any FDA or other warnings about the drug (text or URL).""",
        `@extends` = List(),
        `@range` = List(`@string`, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}