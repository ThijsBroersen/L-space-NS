package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Pond
    extends OntologyDef(
      iri = "http://schema.org/Pond",
      iris = Set("http://schema.org/Pond"),
      label = "Pond",
      comment = """A pond.""",
      `@extends` = () => List(BodyOfWater.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties {}
}
