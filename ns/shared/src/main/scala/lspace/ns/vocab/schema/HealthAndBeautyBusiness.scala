package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthAndBeautyBusiness extends OntologyDef(
        iri = "http://schema.org/HealthAndBeautyBusiness",
        iris = Set("http://schema.org/HealthAndBeautyBusiness"),
        label = "HealthAndBeautyBusiness",
        comment = """Health and beauty.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}