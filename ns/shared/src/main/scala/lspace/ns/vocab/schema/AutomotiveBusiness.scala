package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutomotiveBusiness extends OntologyDef(
        iri = "http://schema.org/AutomotiveBusiness",
        iris = Set("http://schema.org/AutomotiveBusiness"),
        label = "AutomotiveBusiness",
        comment = """Car repair, sales, or parts.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}