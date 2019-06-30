package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Joint extends OntologyDef(
        iri = "http://schema.org/Joint",
        iris = Set("http://schema.org/Joint"),
        label = "Joint",
        comment = """The anatomical location at which two or more bones make contact.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}