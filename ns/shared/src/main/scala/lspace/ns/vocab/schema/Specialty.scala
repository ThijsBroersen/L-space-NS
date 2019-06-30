package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Specialty extends OntologyDef(
        iri = "http://schema.org/Specialty",
        iris = Set("http://schema.org/Specialty"),
        label = "Specialty",
        comment = """Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}