package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OrganizeAction
    extends OntologyDef(
      iri = "http://schema.org/OrganizeAction",
      iris = Set("http://schema.org/OrganizeAction"),
      label = "OrganizeAction",
      comment = """The act of manipulating/administering/supervising/controlling one or more objects.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}
