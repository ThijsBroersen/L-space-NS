package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugStrength extends OntologyDef(
        iri = "http://schema.org/DrugStrength",
        iris = Set("http://schema.org/DrugStrength"),
        label = "DrugStrength",
        comment = """A specific strength in which a medical drug is available in a specific country.""",
        `@extends` = () => List(MedicalIntangible.ontology)
       ){
}