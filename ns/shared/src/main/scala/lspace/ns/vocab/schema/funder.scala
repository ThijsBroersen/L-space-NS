package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object funder extends PropertyDef(
        iri = "https://schema.org/funder",
        iris = Set("https://schema.org/funder"),
        label = "funder",
        comment = """A person or organization that supports (sponsors) something through some kind of financial contribution.""",
        `@extends` = () => List(sponsor),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.sponsor.Properties
}