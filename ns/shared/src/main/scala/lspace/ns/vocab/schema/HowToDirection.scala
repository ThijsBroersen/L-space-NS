package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object HowToDirection
    extends OntologyDef(
      iri = "http://schema.org/HowToDirection",
      iris = Set("http://schema.org/HowToDirection"),
      label = "HowToDirection",
      comment = """A direction indicating a single action to do in the instructions for how to achieve a result.""",
      `@extends` = () => List(CreativeWork.ontology, ListItem.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties with lspace.ns.vocab.schema.ListItem.Properties {
    lazy val afterMedia = lspace.ns.vocab.schema.afterMedia.property
    lazy val supply     = lspace.ns.vocab.schema.supply.property
  }
  override lazy val properties: List[Property] = List(afterMedia, supply)
  trait Properties
      extends lspace.ns.vocab.schema.CreativeWork.Properties
      with lspace.ns.vocab.schema.ListItem.Properties {
    lazy val afterMedia = lspace.ns.vocab.schema.afterMedia.property
    lazy val supply     = lspace.ns.vocab.schema.supply.property
  }
}
