package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object video extends PropertyDef(
        iri = "https://schema.org/video",
        iris = Set("https://schema.org/video"),
        label = "video",
        comment = """An embedded video object.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}