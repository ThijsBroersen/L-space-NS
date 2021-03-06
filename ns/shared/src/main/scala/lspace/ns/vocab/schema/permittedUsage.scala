package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object permittedUsage extends PropertyDef(
        iri = "http://schema.org/permittedUsage",
        iris = Set("http://schema.org/permittedUsage"),
        label = "permittedUsage",
        comment = """Indications regarding the permitted usage of the accommodation.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}