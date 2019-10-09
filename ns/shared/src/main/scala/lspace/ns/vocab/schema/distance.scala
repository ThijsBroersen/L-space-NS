package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object distance extends PropertyDef(
        iri = "http://schema.org/distance",
        iris = Set("http://schema.org/distance"),
        label = "distance",
        comment = """The distance travelled, e.g. exercising or travelling.""",
        `@extends` = List(),
        `@range` = List(Distance.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}