package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gracePeriod
    extends PropertyDef(
      iri = "http://schema.org/gracePeriod",
      iris = Set("http://schema.org/gracePeriod"),
      label = "gracePeriod",
      comment =
        """The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
