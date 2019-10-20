package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sensoryUnit extends PropertyDef(
        iri = "http://schema.org/sensoryUnit",
        iris = Set("http://schema.org/sensoryUnit"),
        label = "sensoryUnit",
        comment = """The neurological pathway extension that inputs and sends information to the brain or spinal cord.""",
        `@extends` = List(),
        `@range` = List(SuperficialAnatomy.ontology, AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}