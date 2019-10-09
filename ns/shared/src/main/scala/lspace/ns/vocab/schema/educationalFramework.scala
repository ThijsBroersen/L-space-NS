package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalFramework extends PropertyDef(
        iri = "http://schema.org/educationalFramework",
        iris = Set("http://schema.org/educationalFramework"),
        label = "educationalFramework",
        comment = """The framework to which the resource being described is aligned.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}