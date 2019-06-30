package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Motorcycle extends OntologyDef(
        iri = "http://schema.org/Motorcycle",
        iris = Set("http://schema.org/Motorcycle"),
        label = "Motorcycle",
        comment = """A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.""",
        `@extends` = () => List(Vehicle.ontology)
       ){
}