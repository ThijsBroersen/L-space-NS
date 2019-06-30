package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hoursAvailable extends PropertyDef(
        iri = "http://schema.org/hoursAvailable",
        iris = Set("http://schema.org/hoursAvailable"),
        label = "hoursAvailable",
        comment = """The hours during which this service or contact is available.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}