package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugPregnancyCategory extends OntologyDef(
        iri = "http://schema.org/DrugPregnancyCategory",
        iris = Set("http://schema.org/DrugPregnancyCategory"),
        label = "DrugPregnancyCategory",
        comment = """Categories that represent an assessment of the risk of fetal injury due to a drug or pharmaceutical used as directed by the mother during pregnancy.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
}