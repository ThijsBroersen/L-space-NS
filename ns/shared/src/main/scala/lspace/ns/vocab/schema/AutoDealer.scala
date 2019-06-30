package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoDealer extends OntologyDef(
        iri = "http://schema.org/AutoDealer",
        iris = Set("http://schema.org/AutoDealer"),
        label = "AutoDealer",
        comment = """An car dealership.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}