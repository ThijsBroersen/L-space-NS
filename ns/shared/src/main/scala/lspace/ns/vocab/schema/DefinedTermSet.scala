package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DefinedTermSet extends OntologyDef(
        iri = "http://schema.org/DefinedTermSet",
        iris = Set("http://schema.org/DefinedTermSet"),
        label = "DefinedTermSet",
        comment = """A set of defined terms for example a set of categories or a classification scheme, a glossary, dictionary or enumeration.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}