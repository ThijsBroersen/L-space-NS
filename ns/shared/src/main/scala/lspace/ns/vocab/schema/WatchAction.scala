package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WatchAction
    extends OntologyDef(
      iri = "http://schema.org/WatchAction",
      iris = Set("http://schema.org/WatchAction"),
      label = "WatchAction",
      comment = """The act of consuming dynamic/moving visual content.""",
      `@extends` = () => List(ConsumeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.ConsumeAction.Properties {}
}
