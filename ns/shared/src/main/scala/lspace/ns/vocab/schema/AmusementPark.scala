package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AmusementPark extends OntologyDef(
        iri = "http://schema.org/AmusementPark",
        iris = Set("http://schema.org/AmusementPark"),
        label = "AmusementPark",
        comment = """An amusement park.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}