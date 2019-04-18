package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AudioObject extends OntologyDef(
        iri = "http://schema.org/AudioObject",
        iris = Set("http://schema.org/AudioObject"),
        label = "AudioObject",
        comment = """An audio file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val transcript = lspace.ns.vocab.schema.transcript.property
}
override lazy val properties: List[LProperty] = List(caption, transcript)
trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val transcript = lspace.ns.vocab.schema.transcript.property
}
}