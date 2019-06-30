package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Florist extends OntologyDef(
        iri = "http://schema.org/Florist",
        iris = Set("http://schema.org/Florist"),
        label = "Florist",
        comment = """A florist.""",
        `@extends` = () => List(Store.ontology)
       ){
}