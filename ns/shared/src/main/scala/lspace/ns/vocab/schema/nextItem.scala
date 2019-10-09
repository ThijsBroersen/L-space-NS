package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nextItem extends PropertyDef(
        iri = "http://schema.org/nextItem",
        iris = Set("http://schema.org/nextItem"),
        label = "nextItem",
        comment = """A link to the ListItem that follows the current one.""",
        `@extends` = List(),
        `@range` = List(ListItem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}