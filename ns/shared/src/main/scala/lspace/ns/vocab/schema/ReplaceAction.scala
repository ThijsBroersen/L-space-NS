package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ReplaceAction
    extends OntologyDef(
      iri = "http://schema.org/ReplaceAction",
      iris = Set("http://schema.org/ReplaceAction"),
      label = "ReplaceAction",
      comment = """The act of editing a recipient by replacing an old object with a new object.""",
      `@extends` = () => List(UpdateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.UpdateAction.Properties {
    lazy val replacer = lspace.ns.vocab.schema.replacer.property
    lazy val replacee = lspace.ns.vocab.schema.replacee.property
  }
  override lazy val properties: List[Property] = List(replacer, replacee)
  trait Properties extends lspace.ns.vocab.schema.UpdateAction.Properties {
    lazy val replacer = lspace.ns.vocab.schema.replacer.property
    lazy val replacee = lspace.ns.vocab.schema.replacee.property
  }
}
