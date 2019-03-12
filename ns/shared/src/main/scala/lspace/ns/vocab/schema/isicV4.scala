package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object isicV4 extends PropertyDef(
        iri = "https://schema.org/isicV4",
        iris = Set("https://schema.org/isicV4"),
        label = "isicV4",
        comment = """The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}