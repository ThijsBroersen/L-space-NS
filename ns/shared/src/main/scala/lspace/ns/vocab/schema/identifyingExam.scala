package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object identifyingExam extends PropertyDef(
        iri = "http://schema.org/identifyingExam",
        iris = Set("http://schema.org/identifyingExam"),
        label = "identifyingExam",
        comment = """A physical examination that can identify this sign.""",
        `@extends` = () => List(),
        `@range` = () => List(PhysicalExam.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}