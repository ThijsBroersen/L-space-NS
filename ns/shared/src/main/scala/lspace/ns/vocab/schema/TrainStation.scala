package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TrainStation
    extends OntologyDef(
      iri = "http://schema.org/TrainStation",
      iris = Set("http://schema.org/TrainStation"),
      label = "TrainStation",
      comment = """A train station.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
