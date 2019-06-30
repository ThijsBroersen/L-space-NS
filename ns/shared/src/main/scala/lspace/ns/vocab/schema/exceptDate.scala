package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exceptDate extends PropertyDef(
        iri = "http://schema.org/exceptDate",
        iris = Set("http://schema.org/exceptDate"),
        label = "exceptDate",
        comment = """Defines a <a class="localLink" href="http://schema.org/Date">Date</a> or <a class="localLink" href="http://schema.org/DateTime">DateTime</a> during which a scheduled <a class="localLink" href="http://schema.org/Event">Event</a> will not take place. The property allows exceptions to
      a <a class="localLink" href="http://schema.org/Schedule">Schedule</a> to be specified. If an exception is specified as a <a class="localLink" href="http://schema.org/DateTime">DateTime</a> then only the event that would have started at that specific date and time
      should be excluded from the schedule. If an exception is specified as a <a class="localLink" href="http://schema.org/Date">Date</a> then any event that is scheduled for that 24 hour period should be
      excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`, `@date`)
       ){
}