package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Legislation extends OntologyDef(
        iri = "http://schema.org/Legislation",
        iris = Set("http://schema.org/Legislation"),
        label = "Legislation",
        comment = """A legal document such as an act, decree, bill, etc. (enforceable or not) or a component of a legal act (like an article).""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val legislationApplies = lspace.ns.vocab.schema.legislationApplies.property
lazy val legislationChanges = lspace.ns.vocab.schema.legislationChanges.property
lazy val legislationConsolidates = lspace.ns.vocab.schema.legislationConsolidates.property
lazy val legislationDate = lspace.ns.vocab.schema.legislationDate.property
lazy val legislationDateVersion = lspace.ns.vocab.schema.legislationDateVersion.property
lazy val legislationIdentifier = lspace.ns.vocab.schema.legislationIdentifier.property
lazy val legislationJurisdiction = lspace.ns.vocab.schema.legislationJurisdiction.property
lazy val legislationLegalForce = lspace.ns.vocab.schema.legislationLegalForce.property
lazy val legislationPassedBy = lspace.ns.vocab.schema.legislationPassedBy.property
lazy val legislationResponsible = lspace.ns.vocab.schema.legislationResponsible.property
lazy val legislationTransposes = lspace.ns.vocab.schema.legislationTransposes.property
lazy val legislationType = lspace.ns.vocab.schema.legislationType.property
}
override lazy val properties: List[LProperty] = List(legislationApplies, legislationChanges, legislationConsolidates, legislationDate, legislationDateVersion, legislationIdentifier, legislationJurisdiction, legislationLegalForce, legislationPassedBy, legislationResponsible, legislationTransposes, legislationType)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val legislationApplies = lspace.ns.vocab.schema.legislationApplies.property
lazy val legislationChanges = lspace.ns.vocab.schema.legislationChanges.property
lazy val legislationConsolidates = lspace.ns.vocab.schema.legislationConsolidates.property
lazy val legislationDate = lspace.ns.vocab.schema.legislationDate.property
lazy val legislationDateVersion = lspace.ns.vocab.schema.legislationDateVersion.property
lazy val legislationIdentifier = lspace.ns.vocab.schema.legislationIdentifier.property
lazy val legislationJurisdiction = lspace.ns.vocab.schema.legislationJurisdiction.property
lazy val legislationLegalForce = lspace.ns.vocab.schema.legislationLegalForce.property
lazy val legislationPassedBy = lspace.ns.vocab.schema.legislationPassedBy.property
lazy val legislationResponsible = lspace.ns.vocab.schema.legislationResponsible.property
lazy val legislationTransposes = lspace.ns.vocab.schema.legislationTransposes.property
lazy val legislationType = lspace.ns.vocab.schema.legislationType.property
}
}