package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object nationality extends PropertyDef(
        iri = "https://schema.org/nationality",
        iris = Set("https://schema.org/nationality"),
        label = "nationality",
        comment = """Nationality of the person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}