package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Nerve
    extends OntologyDef(
      iri = "http://schema.org/Nerve",
      iris = Set("http://schema.org/Nerve"),
      label = "Nerve",
      comment =
        """A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.""",
      `@extends` = () => List(AnatomicalStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {
    lazy val nerveMotor  = lspace.ns.vocab.schema.nerveMotor.property
    lazy val sourcedFrom = lspace.ns.vocab.schema.sourcedFrom.property
    lazy val sensoryUnit = lspace.ns.vocab.schema.sensoryUnit.property
  }
  override lazy val properties: List[LProperty] = List(nerveMotor, sourcedFrom, sensoryUnit)
  trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {
    lazy val nerveMotor  = lspace.ns.vocab.schema.nerveMotor.property
    lazy val sourcedFrom = lspace.ns.vocab.schema.sourcedFrom.property
    lazy val sensoryUnit = lspace.ns.vocab.schema.sensoryUnit.property
  }
}
