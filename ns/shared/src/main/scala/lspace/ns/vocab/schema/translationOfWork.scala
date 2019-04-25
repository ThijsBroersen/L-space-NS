package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object translationOfWork
    extends PropertyDef(
      iri = "http://schema.org/translationOfWork",
      iris = Set("http://schema.org/translationOfWork"),
      label = "translationOfWork",
      comment =
        """The work that this work has been translated from. e.g. 物种起源 is a translationOf “On the Origin of Species”""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
