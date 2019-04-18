package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Waterfall
    extends OntologyDef(
      iri = "http://schema.org/Waterfall",
      iris = Set("http://schema.org/Waterfall"),
      label = "Waterfall",
      comment = """A waterfall, like Niagara.""",
      `@extends` = () => List(BodyOfWater.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties {}
}
