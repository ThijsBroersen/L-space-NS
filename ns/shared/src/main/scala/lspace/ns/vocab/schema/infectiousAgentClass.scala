package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object infectiousAgentClass extends PropertyDef(
        iri = "http://schema.org/infectiousAgentClass",
        iris = Set("http://schema.org/infectiousAgentClass"),
        label = "infectiousAgentClass",
        comment = """The class of infectious agent (bacteria, prion, etc.) that causes the disease.""",
        `@extends` = List(),
        `@range` = List(InfectiousAgentClass.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}