package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object mainEntity extends PropertyDef(
        iri = "https://schema.org/mainEntity",
        iris = Set("https://schema.org/mainEntity"),
        label = "mainEntity",
        comment = """Indicates the primary entity described in some page or other CreativeWork.""",
        `@extends` = () => List(about),
        `@range` = () => List(Thing)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.about.Properties
}