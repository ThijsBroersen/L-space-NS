package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object calories extends PropertyDef(
        iri = "http://schema.org/calories",
        iris = Set("http://schema.org/calories"),
        label = "calories",
        comment = """The number of calories.""",
        `@extends` = List(),
        `@range` = List(Energy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}