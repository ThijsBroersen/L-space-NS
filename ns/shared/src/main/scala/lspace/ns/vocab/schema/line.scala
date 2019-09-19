package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object line extends PropertyDef(
        iri = "http://schema.org/line",
        iris = Set("http://schema.org/line"),
        label = "line",
        comment = """A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}