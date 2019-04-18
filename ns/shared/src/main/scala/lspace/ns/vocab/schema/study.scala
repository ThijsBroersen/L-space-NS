package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object study extends PropertyDef(
        iri = "http://schema.org/study",
        iris = Set("http://schema.org/study"),
        label = "study",
        comment = """A medical study or trial related to this entity.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}