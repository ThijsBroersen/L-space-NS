package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TieAction
    extends OntologyDef(
      iri = "http://schema.org/TieAction",
      iris = Set("http://schema.org/TieAction"),
      label = "TieAction",
      comment = """The act of reaching a draw in a competitive activity.""",
      `@extends` = () => List(AchieveAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AchieveAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AchieveAction.Properties {}
}
