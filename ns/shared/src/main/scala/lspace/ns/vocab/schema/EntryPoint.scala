package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EntryPoint extends OntologyDef(
        iri = "http://schema.org/EntryPoint",
        iris = Set("http://schema.org/EntryPoint"),
        label = "EntryPoint",
        comment = """An entry point, within some Web-based protocol.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}