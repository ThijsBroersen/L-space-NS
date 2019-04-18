package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasMenu extends PropertyDef(
        iri = "http://schema.org/hasMenu",
        iris = Set("http://schema.org/hasMenu"),
        label = "hasMenu",
        comment = """Either the actual menu as a structured representation, as text, or a URL of the menu.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology, Menu.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}