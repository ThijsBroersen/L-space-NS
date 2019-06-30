package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthClub extends OntologyDef(
        iri = "http://schema.org/HealthClub",
        iris = Set("http://schema.org/HealthClub"),
        label = "HealthClub",
        comment = """A health club.""",
        `@extends` = () => List(SportsActivityLocation.ontology, HealthAndBeautyBusiness.ontology)
       ){
}