package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EntertainmentBusiness extends OntologyDef(
        iri = "http://schema.org/EntertainmentBusiness",
        iris = Set("http://schema.org/EntertainmentBusiness"),
        label = "EntertainmentBusiness",
        comment = """A business providing entertainment.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}