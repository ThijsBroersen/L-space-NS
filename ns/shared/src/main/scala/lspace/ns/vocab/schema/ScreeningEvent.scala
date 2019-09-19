package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ScreeningEvent extends OntologyDef(
        iri = "http://schema.org/ScreeningEvent",
        iris = Set("http://schema.org/ScreeningEvent"),
        label = "ScreeningEvent",
        comment = """A screening of a movie or other video.""",
        `@extends` = () => List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
lazy val workPresented = lspace.ns.vocab.schema.workPresented.property
}
override lazy val properties: List[LProperty] = List(subtitleLanguage, videoFormat, workPresented)
trait Properties extends lspace.ns.vocab.schema.Event.Properties{
lazy val subtitleLanguage = lspace.ns.vocab.schema.subtitleLanguage.property
lazy val videoFormat = lspace.ns.vocab.schema.videoFormat.property
lazy val workPresented = lspace.ns.vocab.schema.workPresented.property
}
}