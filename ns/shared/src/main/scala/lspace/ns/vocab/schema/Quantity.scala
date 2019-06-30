package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Quantity extends OntologyDef(
        iri = "http://schema.org/Quantity",
        iris = Set("http://schema.org/Quantity"),
        label = "Quantity",
        comment = """Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}