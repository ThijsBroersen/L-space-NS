package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Float extends OntologyDef(
        iri = "http://schema.org/Float",
        iris = Set("http://schema.org/Float"),
        label = "Float",
        comment = """Data type: Floating number.""",
        `@extends` = () => List(Number.ontology)
       ){
}