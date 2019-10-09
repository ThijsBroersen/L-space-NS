package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object administrationRoute extends PropertyDef(
        iri = "http://schema.org/administrationRoute",
        iris = Set("http://schema.org/administrationRoute"),
        label = "administrationRoute",
        comment = """A route by which this drug may be administered, e.g. 'oral'.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}