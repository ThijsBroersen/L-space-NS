package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Electrician extends OntologyDef(
        iri = "http://schema.org/Electrician",
        iris = Set("http://schema.org/Electrician"),
        label = "Electrician",
        comment = """An electrician.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}