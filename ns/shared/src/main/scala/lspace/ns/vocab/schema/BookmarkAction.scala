package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BookmarkAction
    extends OntologyDef(
      iri = "http://schema.org/BookmarkAction",
      iris = Set("http://schema.org/BookmarkAction"),
      label = "BookmarkAction",
      comment = """An agent bookmarks/flags/labels/tags/marks an object.""",
      `@extends` = () => List(OrganizeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.OrganizeAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.OrganizeAction.Properties {}
}
