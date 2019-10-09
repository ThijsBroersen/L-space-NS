package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object associatedAnatomy extends PropertyDef(
        iri = "http://schema.org/associatedAnatomy",
        iris = Set("http://schema.org/associatedAnatomy"),
        label = "associatedAnatomy",
        comment = """The anatomy of the underlying organ system or structures associated with this entity.""",
        `@extends` = List(),
        `@range` = List(AnatomicalSystem.ontology, SuperficialAnatomy.ontology, AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}