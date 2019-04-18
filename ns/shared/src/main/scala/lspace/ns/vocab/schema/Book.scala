package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Book
    extends OntologyDef(
      iri = "http://schema.org/Book",
      iris = Set("http://schema.org/Book"),
      label = "Book",
      comment = """A book.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val numberOfPages = lspace.ns.vocab.schema.numberOfPages.property
    lazy val abridged      = lspace.ns.vocab.schema.abridged.property
    lazy val illustrator   = lspace.ns.vocab.schema.illustrator.property
  }
  override lazy val properties: List[Property] = List(numberOfPages, abridged, illustrator)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val numberOfPages = lspace.ns.vocab.schema.numberOfPages.property
    lazy val abridged      = lspace.ns.vocab.schema.abridged.property
    lazy val illustrator   = lspace.ns.vocab.schema.illustrator.property
  }
}
