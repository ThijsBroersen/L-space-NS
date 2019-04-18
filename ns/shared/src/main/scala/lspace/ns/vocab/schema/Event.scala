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
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val performer = lspace.ns.vocab.schema.performer.property
lazy val translator = lspace.ns.vocab.schema.translator.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate.property
}
override lazy val properties: List[LProperty] = List(inLanguage, composer, performer, translator, location, recordedIn, review, isAccessibleForFree, previousStartDate)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val performer = lspace.ns.vocab.schema.performer.property
lazy val translator = lspace.ns.vocab.schema.translator.property
lazy val location = lspace.ns.vocab.schema.location.property
lazy val recordedIn = lspace.ns.vocab.schema.recordedIn.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property
lazy val previousStartDate = lspace.ns.vocab.schema.previousStartDate.property
}
}