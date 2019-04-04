package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object version extends PropertyDef(
        iri = "https://schema.org/version",
        iris = Set("https://schema.org/version"),
        label = "version",
        comment = """The version of the CreativeWork embodied by a specified resource.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, `@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}