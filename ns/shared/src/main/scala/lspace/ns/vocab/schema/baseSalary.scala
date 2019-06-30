package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object baseSalary extends PropertyDef(
        iri = "http://schema.org/baseSalary",
        iris = Set("http://schema.org/baseSalary"),
        label = "baseSalary",
        comment = """The base salary of the job or of an employee in an EmployeeRole.""",
        `@extends` = () => List(),
        `@range` = () => List(PriceSpecification.ontology, Number.ontology, MonetaryAmount.ontology)
       ){
}