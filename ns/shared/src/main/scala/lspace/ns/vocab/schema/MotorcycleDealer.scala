package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MotorcycleDealer extends OntologyDef(
        iri = "http://schema.org/MotorcycleDealer",
        iris = Set("http://schema.org/MotorcycleDealer"),
        label = "MotorcycleDealer",
        comment = """A motorcycle dealer.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}