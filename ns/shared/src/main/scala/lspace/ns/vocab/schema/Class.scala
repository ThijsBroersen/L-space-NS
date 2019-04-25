package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Class
    extends OntologyDef(
      iri = "http://schema.org/Class",
      iris = Set("http://schema.org/Class"),
      label = "Class",
      comment = """A class, also often called a 'Type'; equivalent to rdfs:Class.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {}
}
