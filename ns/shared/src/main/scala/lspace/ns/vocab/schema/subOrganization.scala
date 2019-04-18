package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subOrganization extends PropertyDef(
        iri = "http://schema.org/subOrganization",
        iris = Set("http://schema.org/subOrganization"),
        label = "subOrganization",
        comment = """A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}