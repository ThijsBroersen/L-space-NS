package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AMRadioChannel
    extends OntologyDef(
      iri = "http://schema.org/AMRadioChannel",
      iris = Set("http://schema.org/AMRadioChannel"),
      label = "AMRadioChannel",
      comment = """A radio channel that uses AM.""",
      `@extends` = () => List(RadioChannel.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.RadioChannel.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.RadioChannel.Properties {}
}
