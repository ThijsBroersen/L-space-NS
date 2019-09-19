package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object position extends PropertyDef(
        iri = "http://schema.org/position",
        iris = Set("http://schema.org/position"),
        label = "position",
        comment = """The position of an item in a series or sequence of items.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}