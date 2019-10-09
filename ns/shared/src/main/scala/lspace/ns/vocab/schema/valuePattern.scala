package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object valuePattern extends PropertyDef(
        iri = "http://schema.org/valuePattern",
        iris = Set("http://schema.org/valuePattern"),
        label = "valuePattern",
        comment = """Specifies a regular expression for testing literal values according to the HTML spec.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}