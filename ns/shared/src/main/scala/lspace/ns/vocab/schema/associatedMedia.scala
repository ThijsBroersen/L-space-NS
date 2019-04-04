package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object associatedMedia extends PropertyDef(
        iri = "https://schema.org/associatedMedia",
        iris = Set("https://schema.org/associatedMedia"),
        label = "associatedMedia",
        comment = """A media object that encodes this CreativeWork. This property is a synonym for encoding.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}