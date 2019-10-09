package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isProprietary extends PropertyDef(
        iri = "http://schema.org/isProprietary",
        iris = Set("http://schema.org/isProprietary"),
        label = "isProprietary",
        comment = """True if this item's name is a proprietary/brand name (vs. generic name).""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}