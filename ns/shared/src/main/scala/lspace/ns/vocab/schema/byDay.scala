package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object byDay
    extends PropertyDef(
      iri = "http://schema.org/byDay",
      iris = Set("http://schema.org/byDay"),
      label = "byDay",
      comment =
        """Defines the day(s) of the week on which a recurring <a class="localLink" href="http://schema.org/Event">Event</a> takes place""",
      `@extends` = () => List(),
      `@range` = () => List(DayOfWeek.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
