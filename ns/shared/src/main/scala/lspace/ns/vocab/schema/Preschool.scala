package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Preschool extends OntologyDef(
        iri = "http://schema.org/Preschool",
        iris = Set("http://schema.org/Preschool"),
        label = "Preschool",
        comment = """A preschool.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}