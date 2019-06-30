package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MiddleSchool extends OntologyDef(
        iri = "http://schema.org/MiddleSchool",
        iris = Set("http://schema.org/MiddleSchool"),
        label = "MiddleSchool",
        comment = """A middle school (typically for children aged around 11-14, although this varies somewhat).""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}