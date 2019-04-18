package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Vein
    extends OntologyDef(
      iri = "http://schema.org/Vein",
      iris = Set("http://schema.org/Vein"),
      label = "Vein",
      comment = """A type of blood vessel that specifically carries blood to the heart.""",
      `@extends` = () => List(Vessel.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Vessel.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Vessel.Properties {}
}
