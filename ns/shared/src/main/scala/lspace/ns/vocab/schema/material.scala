package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object material extends PropertyDef(
        iri = "https://schema.org/material",
        iris = Set("https://schema.org/material"),
        label = "material",
        comment = """A material that something is made from, e.g. leather, wool, cotton, paper.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}