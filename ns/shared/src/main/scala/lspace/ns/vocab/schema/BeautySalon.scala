package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BeautySalon extends OntologyDef(
        iri = "http://schema.org/BeautySalon",
        iris = Set("http://schema.org/BeautySalon"),
        label = "BeautySalon",
        comment = """Beauty salon.""",
        `@extends` = () => List(HealthAndBeautyBusiness.ontology)
       ){
}