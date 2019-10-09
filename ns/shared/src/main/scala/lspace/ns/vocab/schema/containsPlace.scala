package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object containsPlace extends PropertyDef(
        iri = "http://schema.org/containsPlace",
        iris = Set("http://schema.org/containsPlace"),
        label = "containsPlace",
        comment = """The basic containment relation between a place and another that it contains.""",
        `@extends` = List(),
        `@range` = List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}