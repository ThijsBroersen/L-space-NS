package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Book extends OntologyDef(
        iri = "http://schema.org/Book",
        iris = Set("http://schema.org/Book"),
        label = "Book",
        comment = """A book.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val abridged = lspace.ns.vocab.schema.abridged.property
lazy val bookEdition = lspace.ns.vocab.schema.bookEdition.property
lazy val bookFormat = lspace.ns.vocab.schema.bookFormat.property
lazy val illustrator = lspace.ns.vocab.schema.illustrator.property
lazy val isbn = lspace.ns.vocab.schema.isbn.property
lazy val numberOfPages = lspace.ns.vocab.schema.numberOfPages.property
}
override lazy val properties: List[LProperty] = List(abridged, bookEdition, bookFormat, illustrator, isbn, numberOfPages)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val abridged = lspace.ns.vocab.schema.abridged.property
lazy val bookEdition = lspace.ns.vocab.schema.bookEdition.property
lazy val bookFormat = lspace.ns.vocab.schema.bookFormat.property
lazy val illustrator = lspace.ns.vocab.schema.illustrator.property
lazy val isbn = lspace.ns.vocab.schema.isbn.property
lazy val numberOfPages = lspace.ns.vocab.schema.numberOfPages.property
}
}