package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToSection extends OntologyDef(
        iri = "http://schema.org/HowToSection",
        iris = Set("http://schema.org/HowToSection"),
        label = "HowToSection",
        comment = """A sub-grouping of steps in the instructions for how to achieve a result (e.g. steps for making a pie crust within a pie recipe).""",
        `@extends` = () => List(ListItem.ontology, CreativeWork.ontology, ItemList.ontology)
       ){
}