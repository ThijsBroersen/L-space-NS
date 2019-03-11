package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object performers extends PropertyDef(
        iri = "https://schema.org/performers",
        iris = Set("https://schema.org/performers"),
        label = "performers",
        comment = """The main performer or performers of the event&#x2014;for example, a presenter, musician, or actor.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}