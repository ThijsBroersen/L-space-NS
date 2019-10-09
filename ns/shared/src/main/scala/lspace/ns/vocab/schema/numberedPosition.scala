package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberedPosition extends PropertyDef(
        iri = "http://schema.org/numberedPosition",
        iris = Set("http://schema.org/numberedPosition"),
        label = "numberedPosition",
        comment = """A number associated with a role in an organization, for example, the number on an athlete's jersey.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}