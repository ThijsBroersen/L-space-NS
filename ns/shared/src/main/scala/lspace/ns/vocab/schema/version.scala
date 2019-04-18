package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object version extends PropertyDef(
        iri = "http://schema.org/version",
        iris = Set("http://schema.org/version"),
        label = "version",
        comment = """The version of the CreativeWork embodied by a specified resource.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}