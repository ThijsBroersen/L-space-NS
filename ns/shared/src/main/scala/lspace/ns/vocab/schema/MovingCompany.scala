package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MovingCompany extends OntologyDef(
        iri = "http://schema.org/MovingCompany",
        iris = Set("http://schema.org/MovingCompany"),
        label = "MovingCompany",
        comment = """A moving company.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}