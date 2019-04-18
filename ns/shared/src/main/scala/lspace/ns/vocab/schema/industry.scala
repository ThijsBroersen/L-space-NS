package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object industry extends PropertyDef(
        iri = "http://schema.org/industry",
        iris = Set("http://schema.org/industry"),
        label = "industry",
        comment = """The industry associated with the job position.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}