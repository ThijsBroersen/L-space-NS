package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AppendAction
    extends OntologyDef(
      iri = "http://schema.org/AppendAction",
      iris = Set("http://schema.org/AppendAction"),
      label = "AppendAction",
      comment = """The act of inserting at the end if an ordered collection.""",
      `@extends` = () => List(InsertAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InsertAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.InsertAction.Properties {}
}
