package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object previousItem extends PropertyDef(
        iri = "http://schema.org/previousItem",
        iris = Set("http://schema.org/previousItem"),
        label = "previousItem",
        comment = """A link to the ListItem that preceeds the current one.""",
        `@extends` = List(),
        `@range` = List(ListItem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}