package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RadioSeason
    extends OntologyDef(
      iri = "http://schema.org/RadioSeason",
      iris = Set("http://schema.org/RadioSeason"),
      label = "RadioSeason",
      comment = """Season dedicated to radio broadcast and associated online delivery.""",
      `@extends` = () => List(CreativeWorkSeason.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWorkSeason.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWorkSeason.Properties {}
}
