package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LocalBusiness extends OntologyDef(
        iri = "http://schema.org/LocalBusiness",
        iris = Set("http://schema.org/LocalBusiness"),
        label = "LocalBusiness",
        comment = """A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.""",
        `@extends` = () => List(Place.ontology, Organization.ontology)
       ){
}