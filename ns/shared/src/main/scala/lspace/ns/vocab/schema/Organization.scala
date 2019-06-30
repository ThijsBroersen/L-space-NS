package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Organization extends OntologyDef(
        iri = "http://schema.org/Organization",
        iris = Set("http://schema.org/Organization"),
        label = "Organization",
        comment = """An organization such as a school, NGO, corporation, club, etc.""",
        `@extends` = () => List(Thing.ontology)
       ){
}