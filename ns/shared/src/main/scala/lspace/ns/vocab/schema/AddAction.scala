package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AddAction
    extends OntologyDef(
      iri = "http://schema.org/AddAction",
      iris = Set("http://schema.org/AddAction"),
      label = "AddAction",
      comment = """The act of editing by adding an object to a collection.""",
      `@extends` = () => List(UpdateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.UpdateAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.UpdateAction.Properties {}
}
