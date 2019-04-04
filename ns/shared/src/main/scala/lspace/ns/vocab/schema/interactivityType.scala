package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object interactivityType extends PropertyDef(
        iri = "https://schema.org/interactivityType",
        iris = Set("https://schema.org/interactivityType"),
        label = "interactivityType",
        comment = """The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}