package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object publisherImprint extends PropertyDef(
        iri = "https://schema.org/publisherImprint",
        iris = Set("https://schema.org/publisherImprint"),
        label = "publisherImprint",
        comment = """The publishing division which published the comic.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}