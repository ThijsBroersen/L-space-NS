package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AdministrativeArea extends OntologyDef(
        iri = "http://schema.org/AdministrativeArea",
        iris = Set("http://schema.org/AdministrativeArea"),
        label = "AdministrativeArea",
        comment = """A geographical region, typically under the jurisdiction of a particular government.""",
        `@extends` = () => List(Place.ontology)
       ){
}