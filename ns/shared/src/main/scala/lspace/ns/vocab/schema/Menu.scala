package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Menu extends OntologyDef(
        iri = "http://schema.org/Menu",
        iris = Set("http://schema.org/Menu"),
        label = "Menu",
        comment = """A structured representation of food or drink items available from a FoodEstablishment.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}