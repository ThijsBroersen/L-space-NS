package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Manuscript
    extends OntologyDef(
      iri = "http://schema.org/Manuscript",
      iris = Set("http://schema.org/Manuscript"),
      label = "Manuscript",
      comment = """A book, document, or piece of music written by hand rather than typed or printed.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
