package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeneralContractor extends OntologyDef(
        iri = "http://schema.org/GeneralContractor",
        iris = Set("http://schema.org/GeneralContractor"),
        label = "GeneralContractor",
        comment = """A general contractor.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}