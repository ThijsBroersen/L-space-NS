package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object childMinAge extends PropertyDef(
        iri = "http://schema.org/childMinAge",
        iris = Set("http://schema.org/childMinAge"),
        label = "childMinAge",
        comment = """Minimal age of the child.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}