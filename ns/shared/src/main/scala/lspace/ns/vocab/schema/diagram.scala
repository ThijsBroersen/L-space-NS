package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object diagram extends PropertyDef(
        iri = "http://schema.org/diagram",
        iris = Set("http://schema.org/diagram"),
        label = "diagram",
        comment = """An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}