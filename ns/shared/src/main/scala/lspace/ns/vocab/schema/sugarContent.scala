package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sugarContent extends PropertyDef(
        iri = "http://schema.org/sugarContent",
        iris = Set("http://schema.org/sugarContent"),
        label = "sugarContent",
        comment = """The number of grams of sugar.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}