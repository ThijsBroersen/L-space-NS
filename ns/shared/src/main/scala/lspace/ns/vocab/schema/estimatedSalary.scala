package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object estimatedSalary extends PropertyDef(
        iri = "http://schema.org/estimatedSalary",
        iris = Set("http://schema.org/estimatedSalary"),
        label = "estimatedSalary",
        comment = """An estimated salary for a job posting based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.""",
        `@extends` = List(),
        `@range` = List(MonetaryAmountDistribution.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}