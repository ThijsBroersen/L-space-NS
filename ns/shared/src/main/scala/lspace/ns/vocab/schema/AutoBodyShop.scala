package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoBodyShop extends OntologyDef(
        iri = "http://schema.org/AutoBodyShop",
        iris = Set("http://schema.org/AutoBodyShop"),
        label = "AutoBodyShop",
        comment = """Auto body shop.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}