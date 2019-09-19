package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object median extends PropertyDef(
        iri = "http://schema.org/median",
        iris = Set("http://schema.org/median"),
        label = "median",
        comment = """The median value.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}