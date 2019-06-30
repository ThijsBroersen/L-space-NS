package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dayOfWeek extends PropertyDef(
        iri = "http://schema.org/dayOfWeek",
        iris = Set("http://schema.org/dayOfWeek"),
        label = "dayOfWeek",
        comment = """The day of the week for which these opening hours are valid.""",
        `@extends` = () => List(),
        `@range` = () => List(DayOfWeek.ontology)
       ){
}