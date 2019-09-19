package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object playersOnline extends PropertyDef(
        iri = "http://schema.org/playersOnline",
        iris = Set("http://schema.org/playersOnline"),
        label = "playersOnline",
        comment = """Number of players on the server.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}