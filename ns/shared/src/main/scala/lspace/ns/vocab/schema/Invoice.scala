package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Invoice extends OntologyDef(
        iri = "http://schema.org/Invoice",
        iris = Set("http://schema.org/Invoice"),
        label = "Invoice",
        comment = """A statement of the money due for goods or services; a bill.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}