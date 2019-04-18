package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cookTime extends PropertyDef(
        iri = "http://schema.org/cookTime",
        iris = Set("http://schema.org/cookTime"),
        label = "cookTime",
        comment = """The time it takes to actually cook the dish, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.""",
        `@extends` = () => List(performTime.property),
        `@range` = () => List(Duration.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.performTime.Properties
}