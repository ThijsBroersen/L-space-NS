package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PrependAction
    extends OntologyDef(
      iri = "http://schema.org/PrependAction",
      iris = Set("http://schema.org/PrependAction"),
      label = "PrependAction",
      comment = """The act of inserting at the beginning if an ordered collection.""",
      `@extends` = () => List(InsertAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InsertAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.InsertAction.Properties {}
}
