package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object isPartOf extends PropertyDef(
        iri = "https://schema.org/isPartOf",
        iris = Set("https://schema.org/isPartOf"),
        label = "isPartOf",
        comment = """Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}