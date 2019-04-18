package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object GamePlayMode
    extends OntologyDef(
      iri = "http://schema.org/GamePlayMode",
      iris = Set("http://schema.org/GamePlayMode"),
      label = "GamePlayMode",
      comment = """Indicates whether this game is multi-player, co-op or single-player.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
