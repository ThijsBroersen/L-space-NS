package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Permit extends OntologyDef(
        iri = "http://schema.org/Permit",
        iris = Set("http://schema.org/Permit"),
        label = "Permit",
        comment = """A permit issued by an organization, e.g. a parking pass.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val issuedBy = lspace.ns.vocab.schema.issuedBy.property
lazy val issuedThrough = lspace.ns.vocab.schema.issuedThrough.property
lazy val permitAudience = lspace.ns.vocab.schema.permitAudience.property
lazy val validFor = lspace.ns.vocab.schema.validFor.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validIn = lspace.ns.vocab.schema.validIn.property
lazy val validUntil = lspace.ns.vocab.schema.validUntil.property
}
override lazy val properties: List[LProperty] = List(issuedBy, issuedThrough, permitAudience, validFor, validFrom, validIn, validUntil)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val issuedBy = lspace.ns.vocab.schema.issuedBy.property
lazy val issuedThrough = lspace.ns.vocab.schema.issuedThrough.property
lazy val permitAudience = lspace.ns.vocab.schema.permitAudience.property
lazy val validFor = lspace.ns.vocab.schema.validFor.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validIn = lspace.ns.vocab.schema.validIn.property
lazy val validUntil = lspace.ns.vocab.schema.validUntil.property
}
}