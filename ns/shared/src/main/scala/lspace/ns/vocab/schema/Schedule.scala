package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Schedule extends OntologyDef(
        iri = "http://schema.org/Schedule",
        iris = Set("http://schema.org/Schedule"),
        label = "Schedule",
        comment = """A schedule defines a repeating time period used to describe a regularly occurring <a class="localLink" href="http://schema.org/Event">Event</a>. At a minimum a schedule will specify <a class="localLink" href="http://schema.org/repeatFrequency">repeatFrequency</a> which describes the interval between occurences of the event. Additional information can be provided to specify the schedule more precisely. 
      This includes identifying the day(s) of the week or month when the recurring event will take place, in addition to its start and end time. Schedules may also
      have start and end dates to indicate when they are active, e.g. to define a limited calendar of events.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}