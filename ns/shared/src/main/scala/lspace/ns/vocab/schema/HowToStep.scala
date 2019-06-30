package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToStep extends OntologyDef(
        iri = "http://schema.org/HowToStep",
        iris = Set("http://schema.org/HowToStep"),
        label = "HowToStep",
        comment = """A step in the instructions for how to achieve a result. It is an ordered list with HowToDirection and/or HowToTip items.""",
        `@extends` = () => List(ListItem.ontology, CreativeWork.ontology, ItemList.ontology)
       ){
}