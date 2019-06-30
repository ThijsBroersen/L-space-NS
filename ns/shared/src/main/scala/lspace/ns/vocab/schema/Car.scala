package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Car extends OntologyDef(
        iri = "http://schema.org/Car",
        iris = Set("http://schema.org/Car"),
        label = "Car",
        comment = """A car is a wheeled, self-powered motor vehicle used for transportation.""",
        `@extends` = () => List(Vehicle.ontology)
       ){
}