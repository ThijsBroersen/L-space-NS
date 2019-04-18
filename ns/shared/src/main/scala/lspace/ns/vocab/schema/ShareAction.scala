package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ShareAction
    extends OntologyDef(
      iri = "http://schema.org/ShareAction",
      iris = Set("http://schema.org/ShareAction"),
      label = "ShareAction",
      comment = """The act of distributing content to people for their amusement or edification.""",
      `@extends` = () => List(CommunicateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CommunicateAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CommunicateAction.Properties {}
}
