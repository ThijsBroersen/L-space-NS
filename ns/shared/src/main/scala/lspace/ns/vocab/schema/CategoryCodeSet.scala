package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CategoryCodeSet extends OntologyDef(
        iri = "http://schema.org/CategoryCodeSet",
        iris = Set("http://schema.org/CategoryCodeSet"),
        label = "CategoryCodeSet",
        comment = """A set of Category Code values.""",
        `@extends` = () => List(DefinedTermSet.ontology)
       ){
}