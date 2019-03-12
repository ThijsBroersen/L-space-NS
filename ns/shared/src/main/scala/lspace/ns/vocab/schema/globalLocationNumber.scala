package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object globalLocationNumber extends PropertyDef(
        iri = "https://schema.org/globalLocationNumber",
        iris = Set("https://schema.org/globalLocationNumber"),
        label = "globalLocationNumber",
        comment = """The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.""",
        `@extends` = () => List(identifier),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}