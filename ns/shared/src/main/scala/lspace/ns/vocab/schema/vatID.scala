package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object vatID extends PropertyDef(
        iri = "https://schema.org/vatID",
        iris = Set("https://schema.org/vatID"),
        label = "vatID",
        comment = """The Value-added Tax ID of the organization or person.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}