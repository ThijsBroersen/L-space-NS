package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BuddhistTemple
    extends OntologyDef(
      iri = "http://schema.org/BuddhistTemple",
      iris = Set("http://schema.org/BuddhistTemple"),
      label = "BuddhistTemple",
      comment = """A Buddhist temple.""",
      `@extends` = () => List(PlaceOfWorship.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.PlaceOfWorship.Properties {}
}
