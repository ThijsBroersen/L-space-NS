package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object honorificPrefix extends PropertyDef(
        iri = "https://schema.org/honorificPrefix",
        iris = Set("https://schema.org/honorificPrefix"),
        label = "honorificPrefix",
        comment = """An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}