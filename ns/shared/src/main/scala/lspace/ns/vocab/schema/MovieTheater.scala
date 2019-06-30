package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MovieTheater extends OntologyDef(
        iri = "http://schema.org/MovieTheater",
        iris = Set("http://schema.org/MovieTheater"),
        label = "MovieTheater",
        comment = """A movie theater.""",
        `@extends` = () => List(CivicStructure.ontology, EntertainmentBusiness.ontology)
       ){
}