package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasCategoryCode extends PropertyDef(
        iri = "http://schema.org/hasCategoryCode",
        iris = Set("http://schema.org/hasCategoryCode"),
        label = "hasCategoryCode",
        comment = """A Category code contained in this code set.""",
        `@extends` = () => List(hasDefinedTerm.property),
        `@range` = () => List(CategoryCode.ontology)
       ){
}