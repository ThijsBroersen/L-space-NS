package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Volcano
    extends OntologyDef(
      iri = "http://schema.org/Volcano",
      iris = Set("http://schema.org/Volcano"),
      label = "Volcano",
      comment = """A volcano, like Fuji san.""",
      `@extends` = () => List(Landform.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Landform.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Landform.Properties {}
}
