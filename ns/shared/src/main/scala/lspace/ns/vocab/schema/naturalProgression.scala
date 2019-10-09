package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object naturalProgression extends PropertyDef(
        iri = "http://schema.org/naturalProgression",
        iris = Set("http://schema.org/naturalProgression"),
        label = "naturalProgression",
        comment = """The expected progression of the condition if it is not treated and allowed to progress naturally.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}