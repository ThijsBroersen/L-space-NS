package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfPlayers extends PropertyDef(
        iri = "http://schema.org/numberOfPlayers",
        iris = Set("http://schema.org/numberOfPlayers"),
        label = "numberOfPlayers",
        comment = """Indicate how many people can play this game (minimum, maximum, or range).""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}