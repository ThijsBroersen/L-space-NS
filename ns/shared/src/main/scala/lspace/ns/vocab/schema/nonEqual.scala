package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nonEqual
    extends PropertyDef(
      iri = "http://schema.org/nonEqual",
      iris = Set("http://schema.org/nonEqual"),
      label = "nonEqual",
      comment =
        """This ordering relation for qualitative values indicates that the subject is not equal to the object.""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
