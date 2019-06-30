package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationConsolidates extends PropertyDef(
        iri = "http://schema.org/legislationConsolidates",
        iris = Set("http://schema.org/legislationConsolidates"),
        label = "legislationConsolidates",
        comment = """Indicates another legislation taken into account in this consolidated legislation (which is usually the product of an editorial process that revises the legislation). This property should be used multiple times to refer to both the original version or the previous consolidated version, and to the legislations making the change.""",
        `@extends` = () => List(),
        `@range` = () => List(Legislation.ontology)
       ){
}