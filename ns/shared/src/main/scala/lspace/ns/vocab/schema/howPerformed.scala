package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object howPerformed extends PropertyDef(
        iri = "http://schema.org/howPerformed",
        iris = Set("http://schema.org/howPerformed"),
        label = "howPerformed",
        comment = """How the procedure is performed.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}