package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasMenuItem extends PropertyDef(
        iri = "http://schema.org/hasMenuItem",
        iris = Set("http://schema.org/hasMenuItem"),
        label = "hasMenuItem",
        comment = """A food or drink item contained in a menu or menu section.""",
        `@extends` = () => List(),
        `@range` = () => List(MenuItem.ontology)
       ){
}