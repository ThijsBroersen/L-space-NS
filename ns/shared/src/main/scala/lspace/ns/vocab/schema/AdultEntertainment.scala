package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AdultEntertainment extends OntologyDef(
        iri = "http://schema.org/AdultEntertainment",
        iris = Set("http://schema.org/AdultEntertainment"),
        label = "AdultEntertainment",
        comment = """An adult entertainment establishment.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}