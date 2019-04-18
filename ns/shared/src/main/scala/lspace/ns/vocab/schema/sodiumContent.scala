package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sodiumContent extends PropertyDef(
        iri = "http://schema.org/sodiumContent",
        iris = Set("http://schema.org/sodiumContent"),
        label = "sodiumContent",
        comment = """The number of milligrams of sodium.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}