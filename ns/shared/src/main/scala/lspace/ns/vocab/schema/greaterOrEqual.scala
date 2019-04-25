package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object greaterOrEqual
    extends PropertyDef(
      iri = "http://schema.org/greaterOrEqual",
      iris = Set("http://schema.org/greaterOrEqual"),
      label = "greaterOrEqual",
      comment =
        """This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
