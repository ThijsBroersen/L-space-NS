package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object applicationSubCategory extends PropertyDef(
        iri = "http://schema.org/applicationSubCategory",
        iris = Set("http://schema.org/applicationSubCategory"),
        label = "applicationSubCategory",
        comment = """Subcategory of the application, e.g. 'Arcade Game'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology)
       ){
}