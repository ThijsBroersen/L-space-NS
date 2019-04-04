package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object inverseOf extends PropertyDef(
        iri = "https://schema.org/inverseOf",
        iris = Set("https://schema.org/inverseOf"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}