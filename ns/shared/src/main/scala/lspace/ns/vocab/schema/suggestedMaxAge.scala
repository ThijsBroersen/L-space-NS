package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object suggestedMaxAge extends PropertyDef(
        iri = "http://schema.org/suggestedMaxAge",
        iris = Set("http://schema.org/suggestedMaxAge"),
        label = "suggestedMaxAge",
        comment = """Maximal age recommended for viewing content.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}