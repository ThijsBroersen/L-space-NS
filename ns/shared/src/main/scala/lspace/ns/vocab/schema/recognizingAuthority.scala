package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recognizingAuthority extends PropertyDef(
        iri = "http://schema.org/recognizingAuthority",
        iris = Set("http://schema.org/recognizingAuthority"),
        label = "recognizingAuthority",
        comment = """If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}