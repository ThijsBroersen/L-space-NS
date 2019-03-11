package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Event extends OntologyDef(
        iri = "https://schema.org/Event",
        iris = Set("https://schema.org/Event"),
        label = "Event",
        comment = """An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="http://schema.org/offers">offers</a> property. Repeated events may be structured as separate Event objects.""",
        `@extends` = () => List(Thing)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val doorTime = lspace.ns.vocab.schema.doorTime
lazy val contributor = lspace.ns.vocab.schema.contributor
lazy val subEvents = lspace.ns.vocab.schema.subEvents
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate
lazy val review = lspace.ns.vocab.schema.review
lazy val director = lspace.ns.vocab.schema.director
lazy val translator = lspace.ns.vocab.schema.translator
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn
lazy val duration = lspace.ns.vocab.schema.duration
lazy val attendees = lspace.ns.vocab.schema.attendees
lazy val actor = lspace.ns.vocab.schema.actor
lazy val attendee = lspace.ns.vocab.schema.attendee
lazy val workPerformed = lspace.ns.vocab.schema.workPerformed
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val performers = lspace.ns.vocab.schema.performers
lazy val remainingAttendeeCapacity = lspace.ns.vocab.schema.remainingAttendeeCapacity
lazy val superEvent = lspace.ns.vocab.schema.superEvent
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage
lazy val eventStatus = lspace.ns.vocab.schema.eventStatus
lazy val startDate = lspace.ns.vocab.schema.startDate
lazy val typicalAgeRange = lspace.ns.vocab.schema.typicalAgeRange
lazy val funder = lspace.ns.vocab.schema.funder
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val location = lspace.ns.vocab.schema.location
lazy val offers = lspace.ns.vocab.schema.offers
lazy val audience = lspace.ns.vocab.schema.audience
lazy val workFeatured = lspace.ns.vocab.schema.workFeatured
lazy val about = lspace.ns.vocab.schema.about
lazy val subEvent = lspace.ns.vocab.schema.subEvent
lazy val composer = lspace.ns.vocab.schema.composer
lazy val organizer = lspace.ns.vocab.schema.organizer
lazy val endDate = lspace.ns.vocab.schema.endDate
lazy val performer = lspace.ns.vocab.schema.performer
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val sponsor = lspace.ns.vocab.schema.sponsor}
override lazy val properties: List[Property] = List(doorTime, contributor, subEvents, previousStartDate, review, director, translator, recordedIn, duration, attendees, actor, attendee, workPerformed, maximumAttendeeCapacity, performers, remainingAttendeeCapacity, superEvent, inLanguage, eventStatus, startDate, typicalAgeRange, funder, isAccessibleForFree, location, offers, audience, workFeatured, about, subEvent, composer, organizer, endDate, performer, aggregateRating, sponsor)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val doorTime = lspace.ns.vocab.schema.doorTime
lazy val contributor = lspace.ns.vocab.schema.contributor
lazy val subEvents = lspace.ns.vocab.schema.subEvents
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate
lazy val review = lspace.ns.vocab.schema.review
lazy val director = lspace.ns.vocab.schema.director
lazy val translator = lspace.ns.vocab.schema.translator
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn
lazy val duration = lspace.ns.vocab.schema.duration
lazy val attendees = lspace.ns.vocab.schema.attendees
lazy val actor = lspace.ns.vocab.schema.actor
lazy val attendee = lspace.ns.vocab.schema.attendee
lazy val workPerformed = lspace.ns.vocab.schema.workPerformed
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity
lazy val performers = lspace.ns.vocab.schema.performers
lazy val remainingAttendeeCapacity = lspace.ns.vocab.schema.remainingAttendeeCapacity
lazy val superEvent = lspace.ns.vocab.schema.superEvent
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage
lazy val eventStatus = lspace.ns.vocab.schema.eventStatus
lazy val startDate = lspace.ns.vocab.schema.startDate
lazy val typicalAgeRange = lspace.ns.vocab.schema.typicalAgeRange
lazy val funder = lspace.ns.vocab.schema.funder
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree
lazy val location = lspace.ns.vocab.schema.location
lazy val offers = lspace.ns.vocab.schema.offers
lazy val audience = lspace.ns.vocab.schema.audience
lazy val workFeatured = lspace.ns.vocab.schema.workFeatured
lazy val about = lspace.ns.vocab.schema.about
lazy val subEvent = lspace.ns.vocab.schema.subEvent
lazy val composer = lspace.ns.vocab.schema.composer
lazy val organizer = lspace.ns.vocab.schema.organizer
lazy val endDate = lspace.ns.vocab.schema.endDate
lazy val performer = lspace.ns.vocab.schema.performer
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating
lazy val sponsor = lspace.ns.vocab.schema.sponsor}
}