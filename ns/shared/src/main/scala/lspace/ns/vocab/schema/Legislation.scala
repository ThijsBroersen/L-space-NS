package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Legislation extends OntologyDef(
        iri = "http://schema.org/Legislation",
        iris = Set("http://schema.org/Legislation"),
        label = "Legislation",
        comment = """A legal document such as an act, decree, bill, etc. (enforceable or not) or a component of a legal act (like an article).""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}