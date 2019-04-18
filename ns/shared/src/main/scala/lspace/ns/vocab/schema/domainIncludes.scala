package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object domainIncludes extends PropertyDef(
        iri = "https://schema.org/domainIncludes",
        iris = Set("https://schema.org/domainIncludes"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}