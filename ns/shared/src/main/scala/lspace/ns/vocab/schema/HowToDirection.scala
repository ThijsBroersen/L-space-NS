package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToDirection extends OntologyDef(
        iri = "http://schema.org/HowToDirection",
        iris = Set("http://schema.org/HowToDirection"),
        label = "HowToDirection",
        comment = """A direction indicating a single action to do in the instructions for how to achieve a result.""",
        `@extends` = () => List(CreativeWork.ontology, ListItem.ontology)
       ){
}