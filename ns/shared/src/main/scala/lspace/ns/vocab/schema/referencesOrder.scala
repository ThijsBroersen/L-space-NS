package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object referencesOrder extends PropertyDef(
        iri = "http://schema.org/referencesOrder",
        iris = Set("http://schema.org/referencesOrder"),
        label = "referencesOrder",
        comment = """The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}