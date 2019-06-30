package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GasStation extends OntologyDef(
        iri = "http://schema.org/GasStation",
        iris = Set("http://schema.org/GasStation"),
        label = "GasStation",
        comment = """A gas station.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}