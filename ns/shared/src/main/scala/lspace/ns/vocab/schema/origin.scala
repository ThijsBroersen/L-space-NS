package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object origin extends PropertyDef(
        iri = "http://schema.org/origin",
        iris = Set("http://schema.org/origin"),
        label = "origin",
        comment = """The place or point where a muscle arises.""",
        `@extends` = List(),
        `@range` = List(AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}