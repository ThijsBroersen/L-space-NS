package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Taxi extends OntologyDef(
        iri = "http://schema.org/Taxi",
        iris = Set("http://schema.org/Taxi"),
        label = "Taxi",
        comment = """A taxi.""",
        `@extends` = () => List(Service.ontology)
       ){
}