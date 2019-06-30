package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrinkAction extends OntologyDef(
        iri = "http://schema.org/DrinkAction",
        iris = Set("http://schema.org/DrinkAction"),
        label = "DrinkAction",
        comment = """The act of swallowing liquids.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}