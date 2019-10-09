package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arterialBranch extends PropertyDef(
        iri = "http://schema.org/arterialBranch",
        iris = Set("http://schema.org/arterialBranch"),
        label = "arterialBranch",
        comment = """The branches that comprise the arterial structure.""",
        `@extends` = List(),
        `@range` = List(AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}