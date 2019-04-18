package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasMenuSection extends PropertyDef(
        iri = "http://schema.org/hasMenuSection",
        iris = Set("http://schema.org/hasMenuSection"),
        label = "hasMenuSection",
        comment = """A subgrouping of the menu (by dishes, course, serving time period, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(MenuSection.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}