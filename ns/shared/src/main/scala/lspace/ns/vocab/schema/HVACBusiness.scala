package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HVACBusiness extends OntologyDef(
        iri = "http://schema.org/HVACBusiness",
        iris = Set("http://schema.org/HVACBusiness"),
        label = "HVACBusiness",
        comment = """A business that provide Heating, Ventilation and Air Conditioning services.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}