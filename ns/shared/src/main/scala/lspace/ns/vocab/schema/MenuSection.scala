package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MenuSection extends OntologyDef(
        iri = "http://schema.org/MenuSection",
        iris = Set("http://schema.org/MenuSection"),
        label = "MenuSection",
        comment = """A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner', 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks', etc.), or some other classification made by the menu provider.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}