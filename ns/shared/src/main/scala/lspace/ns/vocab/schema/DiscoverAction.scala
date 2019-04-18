package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DiscoverAction
    extends OntologyDef(
      iri = "http://schema.org/DiscoverAction",
      iris = Set("http://schema.org/DiscoverAction"),
      label = "DiscoverAction",
      comment = """The act of discovering/finding an object.""",
      `@extends` = () => List(FindAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.FindAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.FindAction.Properties {}
}
