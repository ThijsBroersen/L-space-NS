package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Play extends OntologyDef(
        iri = "http://schema.org/Play",
        iris = Set("http://schema.org/Play"),
        label = "Play",
        comment = """A play is a form of literature, usually consisting of dialogue between characters, intended for theatrical performance rather than just reading. Note the peformance of a Play would be a <a class="localLink" href="http://schema.org/TheaterEvent">TheaterEvent</a> - the <em>Play</em> being the <a class="localLink" href="http://schema.org/workPerformed">workPerformed</a>.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}