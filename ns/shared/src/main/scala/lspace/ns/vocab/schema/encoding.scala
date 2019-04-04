package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object encoding extends PropertyDef(
        iri = "https://schema.org/encoding",
        iris = Set("https://schema.org/encoding"),
        label = "encoding",
        comment = """A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}