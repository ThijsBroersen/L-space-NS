package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object birthPlace extends PropertyDef(
        iri = "http://schema.org/birthPlace",
        iris = Set("http://schema.org/birthPlace"),
        label = "birthPlace",
        comment = """The place where the person was born.""",
        `@extends` = List(),
        `@range` = List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}