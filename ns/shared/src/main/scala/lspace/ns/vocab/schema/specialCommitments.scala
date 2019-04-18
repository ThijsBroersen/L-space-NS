package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object specialCommitments
    extends PropertyDef(
      iri = "http://schema.org/specialCommitments",
      iris = Set("http://schema.org/specialCommitments"),
      label = "specialCommitments",
      comment =
        """Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
