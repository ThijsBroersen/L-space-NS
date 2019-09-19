package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object valueRequired extends PropertyDef(
        iri = "http://schema.org/valueRequired",
        iris = Set("http://schema.org/valueRequired"),
        label = "valueRequired",
        comment = """Whether the property must be filled in to complete the action.  Default is false.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}