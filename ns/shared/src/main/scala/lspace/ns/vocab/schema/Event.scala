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
}