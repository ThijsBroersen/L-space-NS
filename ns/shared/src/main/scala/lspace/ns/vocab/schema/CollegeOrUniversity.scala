package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CollegeOrUniversity extends OntologyDef(
        iri = "http://schema.org/CollegeOrUniversity",
        iris = Set("http://schema.org/CollegeOrUniversity"),
        label = "CollegeOrUniversity",
        comment = """A college, university, or other third-level educational institution.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}