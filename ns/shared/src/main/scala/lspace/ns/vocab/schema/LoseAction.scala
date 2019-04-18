package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object LoseAction
    extends OntologyDef(
      iri = "http://schema.org/LoseAction",
      iris = Set("http://schema.org/LoseAction"),
      label = "LoseAction",
      comment = """The act of being defeated in a competitive activity.""",
      `@extends` = () => List(AchieveAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AchieveAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AchieveAction.Properties {}
}
