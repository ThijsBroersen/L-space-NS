package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationType extends PropertyDef(
        iri = "http://schema.org/legislationType",
        iris = Set("http://schema.org/legislationType"),
        label = "legislationType",
        comment = """The type of the legislation. Examples of values are "law", "act", "directive", "decree", "regulation", "statutory instrument", "loi organique", "règlement grand-ducal", etc., depending on the country.""",
        `@extends` = () => List(genre.property),
        `@range` = () => List(CategoryCode.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.genre.Properties
}