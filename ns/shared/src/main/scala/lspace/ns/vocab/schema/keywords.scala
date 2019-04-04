package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object keywords extends PropertyDef(
        iri = "https://schema.org/keywords",
        iris = Set("https://schema.org/keywords"),
        label = "keywords",
        comment = """Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}