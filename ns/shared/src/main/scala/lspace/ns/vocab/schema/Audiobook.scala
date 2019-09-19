package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Audiobook extends OntologyDef(
        iri = "http://schema.org/Audiobook",
        iris = Set("http://schema.org/Audiobook"),
        label = "Audiobook",
        comment = """An audiobook.""",
        `@extends` = () => List(AudioObject.ontology, Book.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AudioObject.Properties with lspace.ns.vocab.schema.Book.Properties{
lazy val readBy = lspace.ns.vocab.schema.readBy.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
override lazy val properties: List[LProperty] = List(readBy)
trait Properties extends lspace.ns.vocab.schema.AudioObject.Properties with lspace.ns.vocab.schema.Book.Properties{
lazy val readBy = lspace.ns.vocab.schema.readBy.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
}