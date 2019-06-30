package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EatAction extends OntologyDef(
        iri = "http://schema.org/EatAction",
        iris = Set("http://schema.org/EatAction"),
        label = "EatAction",
        comment = """The act of swallowing solid objects.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}