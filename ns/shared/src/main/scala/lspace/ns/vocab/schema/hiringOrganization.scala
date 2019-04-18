package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hiringOrganization extends PropertyDef(
        iri = "http://schema.org/hiringOrganization",
        iris = Set("http://schema.org/hiringOrganization"),
        label = "hiringOrganization",
        comment = """Organization offering the job position.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}