package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gender extends PropertyDef(
        iri = "http://schema.org/gender",
        iris = Set("http://schema.org/gender"),
        label = "gender",
        comment = """Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.""",
        `@extends` = () => List(),
        `@range` = () => List(GenderType.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}