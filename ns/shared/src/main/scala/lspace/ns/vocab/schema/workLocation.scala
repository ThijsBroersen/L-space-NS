package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object workLocation extends PropertyDef(
        iri = "https://schema.org/workLocation",
        iris = Set("https://schema.org/workLocation"),
        label = "workLocation",
        comment = """A contact location for a person's place of work.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}