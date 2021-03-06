package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object phase extends PropertyDef(
        iri = "http://schema.org/phase",
        iris = Set("http://schema.org/phase"),
        label = "phase",
        comment = """The phase of the clinical trial.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}