package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AnimalShelter extends OntologyDef(
        iri = "http://schema.org/AnimalShelter",
        iris = Set("http://schema.org/AnimalShelter"),
        label = "AnimalShelter",
        comment = """Animal shelter.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}