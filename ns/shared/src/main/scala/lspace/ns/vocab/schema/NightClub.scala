package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NightClub extends OntologyDef(
        iri = "http://schema.org/NightClub",
        iris = Set("http://schema.org/NightClub"),
        label = "NightClub",
        comment = """A nightclub or discotheque.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}