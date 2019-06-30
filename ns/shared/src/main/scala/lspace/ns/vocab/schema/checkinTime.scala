package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object checkinTime extends PropertyDef(
        iri = "http://schema.org/checkinTime",
        iris = Set("http://schema.org/checkinTime"),
        label = "checkinTime",
        comment = """The earliest someone may check into a lodging establishment.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){
}