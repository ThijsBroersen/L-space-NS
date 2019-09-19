package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusinessAudience extends OntologyDef(
        iri = "http://schema.org/BusinessAudience",
        iris = Set("http://schema.org/BusinessAudience"),
        label = "BusinessAudience",
        comment = """A set of characteristics belonging to businesses, e.g. who compose an item's target audience.""",
        `@extends` = () => List(Audience.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Audience.Properties{
lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
lazy val yearlyRevenue = lspace.ns.vocab.schema.yearlyRevenue.property
lazy val yearsInOperation = lspace.ns.vocab.schema.yearsInOperation.property
}
override lazy val properties: List[LProperty] = List(numberOfEmployees, yearlyRevenue, yearsInOperation)
trait Properties extends lspace.ns.vocab.schema.Audience.Properties{
lazy val numberOfEmployees = lspace.ns.vocab.schema.numberOfEmployees.property
lazy val yearlyRevenue = lspace.ns.vocab.schema.yearlyRevenue.property
lazy val yearsInOperation = lspace.ns.vocab.schema.yearsInOperation.property
}
}