package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CategoryCode extends OntologyDef(
        iri = "http://schema.org/CategoryCode",
        iris = Set("http://schema.org/CategoryCode"),
        label = "CategoryCode",
        comment = """A Category Code.""",
        `@extends` = () => List(DefinedTerm.ontology)
       ){
}