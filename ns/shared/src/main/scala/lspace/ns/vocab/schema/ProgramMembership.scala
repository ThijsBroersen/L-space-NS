package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ProgramMembership
    extends OntologyDef(
      iri = "http://schema.org/ProgramMembership",
      iris = Set("http://schema.org/ProgramMembership"),
      label = "ProgramMembership",
      comment =
        """Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val member                 = lspace.ns.vocab.schema.member.property
    lazy val members                = lspace.ns.vocab.schema.members.property
    lazy val programName            = lspace.ns.vocab.schema.programName.property
    lazy val hostingOrganization    = lspace.ns.vocab.schema.hostingOrganization.property
    lazy val membershipPointsEarned = lspace.ns.vocab.schema.membershipPointsEarned.property
  }
  override lazy val properties: List[Property] =
    List(member, members, programName, hostingOrganization, membershipPointsEarned)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val member                 = lspace.ns.vocab.schema.member.property
    lazy val members                = lspace.ns.vocab.schema.members.property
    lazy val programName            = lspace.ns.vocab.schema.programName.property
    lazy val hostingOrganization    = lspace.ns.vocab.schema.hostingOrganization.property
    lazy val membershipPointsEarned = lspace.ns.vocab.schema.membershipPointsEarned.property
  }
}
