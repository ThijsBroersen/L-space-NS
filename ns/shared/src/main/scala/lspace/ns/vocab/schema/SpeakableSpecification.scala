package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SpeakableSpecification extends OntologyDef(
        iri = "http://schema.org/SpeakableSpecification",
        iris = Set("http://schema.org/SpeakableSpecification"),
        label = "SpeakableSpecification",
        comment = """A SpeakableSpecification indicates (typically via <a class="localLink" href="http://schema.org/xpath">xpath</a> or <a class="localLink" href="http://schema.org/cssSelector">cssSelector</a>) sections of a document that are highlighted as particularly <a class="localLink" href="http://schema.org/speakable">speakable</a>. Instances of this type are expected to be used primarily as values of the <a class="localLink" href="http://schema.org/speakable">speakable</a> property.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}