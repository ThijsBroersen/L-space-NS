package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MotorcycleRepair extends OntologyDef(
        iri = "http://schema.org/MotorcycleRepair",
        iris = Set("http://schema.org/MotorcycleRepair"),
        label = "MotorcycleRepair",
        comment = """A motorcycle repair shop.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}