package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComedyClub extends OntologyDef(
        iri = "http://schema.org/ComedyClub",
        iris = Set("http://schema.org/ComedyClub"),
        label = "ComedyClub",
        comment = """A comedy club.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}