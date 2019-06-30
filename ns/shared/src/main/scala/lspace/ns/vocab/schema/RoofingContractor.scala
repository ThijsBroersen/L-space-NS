package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RoofingContractor extends OntologyDef(
        iri = "http://schema.org/RoofingContractor",
        iris = Set("http://schema.org/RoofingContractor"),
        label = "RoofingContractor",
        comment = """A roofing contractor.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}