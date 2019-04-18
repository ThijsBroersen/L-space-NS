package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object WinAction
    extends OntologyDef(
      iri = "http://schema.org/WinAction",
      iris = Set("http://schema.org/WinAction"),
      label = "WinAction",
      comment = """The act of achieving victory in a competitive activity.""",
      `@extends` = () => List(AchieveAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AchieveAction.Properties {
    lazy val loser = lspace.ns.vocab.schema.loser.property
  }
  override lazy val properties: List[Property] = List(loser)
  trait Properties extends lspace.ns.vocab.schema.AchieveAction.Properties {
    lazy val loser = lspace.ns.vocab.schema.loser.property
  }
}
