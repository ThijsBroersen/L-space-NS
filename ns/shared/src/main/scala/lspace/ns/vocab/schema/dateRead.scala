package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dateRead extends PropertyDef(
        iri = "http://schema.org/dateRead",
        iris = Set("http://schema.org/dateRead"),
        label = "dateRead",
        comment = """The date/time at which the message has been read by the recipient if a single recipient exists.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){
}