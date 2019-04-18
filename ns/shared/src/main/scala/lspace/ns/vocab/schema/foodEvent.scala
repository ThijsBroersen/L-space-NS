package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object foodEvent extends PropertyDef(
        iri = "http://schema.org/foodEvent",
        iris = Set("http://schema.org/foodEvent"),
        label = "foodEvent",
        comment = """A sub property of location. The specific food event where the action occurred.""",
        `@extends` = () => List(location.property),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.location.Properties
}