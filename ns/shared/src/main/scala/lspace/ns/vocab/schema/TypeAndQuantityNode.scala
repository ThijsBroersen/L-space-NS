package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TypeAndQuantityNode
    extends OntologyDef(
      iri = "http://schema.org/TypeAndQuantityNode",
      iris = Set("http://schema.org/TypeAndQuantityNode"),
      label = "TypeAndQuantityNode",
      comment =
        """A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val businessFunction = lspace.ns.vocab.schema.businessFunction.property
    lazy val unitCode         = lspace.ns.vocab.schema.unitCode.property
    lazy val unitText         = lspace.ns.vocab.schema.unitText.property
  }
  override lazy val properties: List[Property] = List(businessFunction, unitCode, unitText)
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val businessFunction = lspace.ns.vocab.schema.businessFunction.property
    lazy val unitCode         = lspace.ns.vocab.schema.unitCode.property
    lazy val unitText         = lspace.ns.vocab.schema.unitText.property
  }
}
