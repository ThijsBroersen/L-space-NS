package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToItem extends OntologyDef(
        iri = "http://schema.org/HowToItem",
        iris = Set("http://schema.org/HowToItem"),
        label = "HowToItem",
        comment = """An item used as either a tool or supply when performing the instructions for how to to achieve a result.""",
        `@extends` = () => List(ListItem.ontology)
       ){
}