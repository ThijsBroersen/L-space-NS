package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Class
    extends OntologyDef(
      iri = "http://schema.org/Class",
      iris = Set("http://schema.org/Class"),
      label = "Class",
      comment = """A class, also often called a 'Type'; equivalent to rdfs:Class.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {}
}
