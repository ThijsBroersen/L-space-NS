package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object supersededBy extends PropertyDef(
        iri = "https://schema.org/supersededBy",
        iris = Set("https://schema.org/supersededBy"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}