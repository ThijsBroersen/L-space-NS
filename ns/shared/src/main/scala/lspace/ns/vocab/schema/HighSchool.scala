package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HighSchool extends OntologyDef(
        iri = "http://schema.org/HighSchool",
        iris = Set("http://schema.org/HighSchool"),
        label = "HighSchool",
        comment = """A high school.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}