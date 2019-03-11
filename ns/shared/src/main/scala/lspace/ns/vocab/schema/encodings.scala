package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object encodings extends PropertyDef(
        iri = "https://schema.org/encodings",
        iris = Set("https://schema.org/encodings"),
        label = "encodings",
        comment = """A media object that encodes this CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}