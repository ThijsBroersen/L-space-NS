package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalTime extends PropertyDef(
        iri = "http://schema.org/arrivalTime",
        iris = Set("http://schema.org/arrivalTime"),
        label = "arrivalTime",
        comment = """The expected arrival time.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){
}