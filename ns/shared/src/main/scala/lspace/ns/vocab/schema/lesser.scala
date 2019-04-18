package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object lesser
    extends PropertyDef(
      iri = "http://schema.org/lesser",
      iris = Set("http://schema.org/lesser"),
      label = "lesser",
      comment =
        """This ordering relation for qualitative values indicates that the subject is lesser than the object.""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
