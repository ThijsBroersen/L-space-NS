package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object runsTo extends PropertyDef(
        iri = "http://schema.org/runsTo",
        iris = Set("http://schema.org/runsTo"),
        label = "runsTo",
        comment = """The vasculature the lymphatic structure runs, or efferents, to.""",
        `@extends` = List(),
        `@range` = List(Vessel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}