package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object drainsTo extends PropertyDef(
        iri = "http://schema.org/drainsTo",
        iris = Set("http://schema.org/drainsTo"),
        label = "drainsTo",
        comment = """The vasculature that the vein drains into.""",
        `@extends` = List(),
        `@range` = List(Vessel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}