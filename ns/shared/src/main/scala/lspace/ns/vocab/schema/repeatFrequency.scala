package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object repeatFrequency extends PropertyDef(
        iri = "http://schema.org/repeatFrequency",
        iris = Set("http://schema.org/repeatFrequency"),
        label = "repeatFrequency",
        comment = """Defines the frequency at which <a class="localLink" href="http://schema.org/Events">Events</a> will occur according to a schedule <a class="localLink" href="http://schema.org/Schedule">Schedule</a>. The intervals between
      events should be defined as a <a class="localLink" href="http://schema.org/Duration">Duration</a> of time.""",
        `@extends` = List(frequency.property),
        `@range` = List(Duration.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.frequency.Properties
}