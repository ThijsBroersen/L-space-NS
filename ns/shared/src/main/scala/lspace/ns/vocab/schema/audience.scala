package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object audience extends PropertyDef(
        iri = "https://schema.org/audience",
        iris = Set("https://schema.org/audience"),
        label = "audience",
        comment = """An intended audience, i.e. a group for whom something was created.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}