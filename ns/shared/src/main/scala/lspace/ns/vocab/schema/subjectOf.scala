package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object subjectOf extends PropertyDef(
        iri = "https://schema.org/subjectOf",
        iris = Set("https://schema.org/subjectOf"),
        label = "subjectOf",
        comment = """A CreativeWork or Event about this Thing..""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}