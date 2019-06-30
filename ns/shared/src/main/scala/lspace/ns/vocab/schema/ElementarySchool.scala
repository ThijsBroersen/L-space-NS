package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ElementarySchool extends OntologyDef(
        iri = "http://schema.org/ElementarySchool",
        iris = Set("http://schema.org/ElementarySchool"),
        label = "ElementarySchool",
        comment = """An elementary school.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}