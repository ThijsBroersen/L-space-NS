package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DefinedTermSet extends OntologyDef(
        iri = "http://schema.org/DefinedTermSet",
        iris = Set("http://schema.org/DefinedTermSet"),
        label = "DefinedTermSet",
        comment = """A set of defined terms for example a set of categories or a classification scheme, a glossary, dictionary or enumeration.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val hasDefinedTerm = lspace.ns.vocab.schema.hasDefinedTerm.property
}
override lazy val properties: List[LProperty] = List(hasDefinedTerm)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val hasDefinedTerm = lspace.ns.vocab.schema.hasDefinedTerm.property
}
}