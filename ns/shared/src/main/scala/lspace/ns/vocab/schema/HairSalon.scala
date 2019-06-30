package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HairSalon extends OntologyDef(
        iri = "http://schema.org/HairSalon",
        iris = Set("http://schema.org/HairSalon"),
        label = "HairSalon",
        comment = """A hair salon.""",
        `@extends` = () => List(HealthAndBeautyBusiness.ontology)
       ){
}