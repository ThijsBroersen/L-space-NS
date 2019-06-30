package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanMarketingUrl extends PropertyDef(
        iri = "http://schema.org/healthPlanMarketingUrl",
        iris = Set("http://schema.org/healthPlanMarketingUrl"),
        label = "healthPlanMarketingUrl",
        comment = """The URL that goes directly to the plan brochure for the specific standard plan or plan variation.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){
}