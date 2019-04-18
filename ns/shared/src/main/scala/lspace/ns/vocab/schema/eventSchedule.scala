package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object eventSchedule
    extends PropertyDef(
      iri = "http://schema.org/eventSchedule",
      iris = Set("http://schema.org/eventSchedule"),
      label = "eventSchedule",
      comment =
        """Associates an <a class="localLink" href="http://schema.org/Event">Event</a> with a <a class="localLink" href="http://schema.org/Schedule">Schedule</a>. There are circumstances where it is preferable to share a schedule for a series of
      repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
      gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An <a class="localLink" href="http://schema.org/Event">Event</a> that
      is associated with a <a class="localLink" href="http://schema.org/Schedule">Schedule</a> using this property should not have <a class="localLink" href="http://schema.org/startDate">startDate</a> or <a class="localLink" href="http://schema.org/endDate">endDate</a> properties. These are instead defined within the associated
      <a class="localLink" href="http://schema.org/Schedule">Schedule</a>, this avoids any ambiguity for clients using the data. The propery might have repeated values to specify different schedules, e.g. for different months
      or seasons.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
