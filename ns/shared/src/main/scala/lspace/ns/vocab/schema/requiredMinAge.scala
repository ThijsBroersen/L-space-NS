package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object requiredMinAge extends PropertyDef(
        iri = "http://schema.org/requiredMinAge",
        iris = Set("http://schema.org/requiredMinAge"),
        label = "requiredMinAge",
        comment = """Audiences defined by a person's minimum age.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}