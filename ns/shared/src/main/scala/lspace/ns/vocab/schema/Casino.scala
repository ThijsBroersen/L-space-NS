package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Casino extends OntologyDef(
        iri = "http://schema.org/Casino",
        iris = Set("http://schema.org/Casino"),
        label = "Casino",
        comment = """A casino.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}