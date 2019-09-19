package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Event extends OntologyDef(
        iri = "http://schema.org/Event",
        iris = Set("http://schema.org/Event"),
        label = "Event",
        comment = """An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="http://schema.org/offers">offers</a> property. Repeated events may be structured as separate Event objects.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val about = lspace.ns.vocab.schema.about.property
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val attendee = lspace.ns.vocab.schema.attendee.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val contributor = lspace.ns.vocab.schema.contributor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val doorTime = lspace.ns.vocab.schema.doorTime.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val eventStatus = lspace.ns.vocab.schema.eventStatus.property
lazy val funder = lspace.ns.vocab.schema.funder.property
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val organizer = lspace.ns.vocab.schema.organizer.property
lazy val performer = lspace.ns.vocab.schema.performer.property
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate.property
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn.property
lazy val remainingAttendeeCapacity = lspace.ns.vocab.schema.remainingAttendeeCapacity.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
lazy val subEvent = lspace.ns.vocab.schema.subEvent.property
lazy val superEvent = lspace.ns.vocab.schema.superEvent.property
lazy val translator = lspace.ns.vocab.schema.translator.property
lazy val typicalAgeRange = lspace.ns.vocab.schema.typicalAgeRange.property
lazy val workFeatured = lspace.ns.vocab.schema.workFeatured.property
lazy val workPerformed = lspace.ns.vocab.schema.workPerformed.property
}
override lazy val properties: List[LProperty] = List(about, actor, aggregateRating, attendee, audience, composer, contributor, director, doorTime, duration, endDate, eventStatus, funder, inLanguage, isAccessibleForFree, location, maximumAttendeeCapacity, offers, organizer, performer, previousStartDate, recordedIn, remainingAttendeeCapacity, review, sponsor, startDate, subEvent, superEvent, translator, typicalAgeRange, workFeatured, workPerformed)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val about = lspace.ns.vocab.schema.about.property
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val attendee = lspace.ns.vocab.schema.attendee.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val contributor = lspace.ns.vocab.schema.contributor.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val doorTime = lspace.ns.vocab.schema.doorTime.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val eventStatus = lspace.ns.vocab.schema.eventStatus.property
lazy val funder = lspace.ns.vocab.schema.funder.property
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val maximumAttendeeCapacity = lspace.ns.vocab.schema.maximumAttendeeCapacity.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val organizer = lspace.ns.vocab.schema.organizer.property
lazy val performer = lspace.ns.vocab.schema.performer.property
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate.property
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn.property
lazy val remainingAttendeeCapacity = lspace.ns.vocab.schema.remainingAttendeeCapacity.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
lazy val subEvent = lspace.ns.vocab.schema.subEvent.property
lazy val superEvent = lspace.ns.vocab.schema.superEvent.property
lazy val translator = lspace.ns.vocab.schema.translator.property
lazy val typicalAgeRange = lspace.ns.vocab.schema.typicalAgeRange.property
lazy val workFeatured = lspace.ns.vocab.schema.workFeatured.property
lazy val workPerformed = lspace.ns.vocab.schema.workPerformed.property
}
}