package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetName extends PropertyDef(
        iri = "http://schema.org/targetName",
        iris = Set("http://schema.org/targetName"),
        label = "targetName",
        comment = """The name of a node in an established educational framework.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}