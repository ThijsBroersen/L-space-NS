package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegislationObject extends OntologyDef(
        iri = "http://schema.org/LegislationObject",
        iris = Set("http://schema.org/LegislationObject"),
        label = "LegislationObject",
        comment = """A specific object or file containing a Legislation. Note that the same Legislation can be published in multiple files. For example, a digitally signed PDF, a plain PDF and an HTML version.""",
        `@extends` = () => List(Legislation.ontology, MediaObject.ontology)
       ){
}