package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object childMaxAge extends PropertyDef(
        iri = "http://schema.org/childMaxAge",
        iris = Set("http://schema.org/childMaxAge"),
        label = "childMaxAge",
        comment = """Maximal age of the child.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}