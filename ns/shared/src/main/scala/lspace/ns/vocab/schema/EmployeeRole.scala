package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmployeeRole extends OntologyDef(
        iri = "http://schema.org/EmployeeRole",
        iris = Set("http://schema.org/EmployeeRole"),
        label = "EmployeeRole",
        comment = """A subclass of OrganizationRole used to describe employee relationships.""",
        `@extends` = () => List(OrganizationRole.ontology)
       ){
object keys extends lspace.ns.vocab.schema.OrganizationRole.Properties{
lazy val baseSalary = lspace.ns.vocab.schema.baseSalary.property
lazy val salaryCurrency = lspace.ns.vocab.schema.salaryCurrency.property
}
override lazy val properties: List[LProperty] = List(baseSalary, salaryCurrency)
trait Properties extends lspace.ns.vocab.schema.OrganizationRole.Properties{
lazy val baseSalary = lspace.ns.vocab.schema.baseSalary.property
lazy val salaryCurrency = lspace.ns.vocab.schema.salaryCurrency.property
}
}