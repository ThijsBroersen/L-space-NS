package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object memberOf extends PropertyDef(
        iri = "http://schema.org/memberOf",
        iris = Set("http://schema.org/memberOf"),
        label = "memberOf",
        comment = """An Organization (or ProgramMembership) to which this Person or Organization belongs.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology, ProgramMembership.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}