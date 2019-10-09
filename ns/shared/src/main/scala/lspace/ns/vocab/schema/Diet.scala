package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Diet extends OntologyDef(
        iri = "http://schema.org/Diet",
        iris = Set("http://schema.org/Diet"),
        label = "Diet",
        comment = """A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.""",
        `@extends` = List(LifestyleModification.ontology, CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.LifestyleModification.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val dietFeatures = lspace.ns.vocab.schema.dietFeatures.property
lazy val endorsers = lspace.ns.vocab.schema.endorsers.property
lazy val expertConsiderations = lspace.ns.vocab.schema.expertConsiderations.property
lazy val overview = lspace.ns.vocab.schema.overview.property
lazy val physiologicalBenefits = lspace.ns.vocab.schema.physiologicalBenefits.property
lazy val risks = lspace.ns.vocab.schema.risks.property
}
override lazy val properties: List[LProperty] = List(dietFeatures, endorsers, expertConsiderations, overview, physiologicalBenefits, risks)
trait Properties extends lspace.ns.vocab.schema.LifestyleModification.Properties with lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val dietFeatures = lspace.ns.vocab.schema.dietFeatures.property
lazy val endorsers = lspace.ns.vocab.schema.endorsers.property
lazy val expertConsiderations = lspace.ns.vocab.schema.expertConsiderations.property
lazy val overview = lspace.ns.vocab.schema.overview.property
lazy val physiologicalBenefits = lspace.ns.vocab.schema.physiologicalBenefits.property
lazy val risks = lspace.ns.vocab.schema.risks.property
}
}