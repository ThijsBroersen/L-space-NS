package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetDescription extends PropertyDef(
        iri = "http://schema.org/targetDescription",
        iris = Set("http://schema.org/targetDescription"),
        label = "targetDescription",
        comment = """The description of a node in an established educational framework.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}