package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object LibrarySystem
    extends OntologyDef(
      iri = "http://schema.org/LibrarySystem",
      iris = Set("http://schema.org/LibrarySystem"),
      label = "LibrarySystem",
      comment =
        """A <a class="localLink" href="http://schema.org/LibrarySystem">LibrarySystem</a> is a collaborative system amongst several libraries.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {}
}
