package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object insertion extends PropertyDef(
        iri = "http://schema.org/insertion",
        iris = Set("http://schema.org/insertion"),
        label = "insertion",
        comment = """The place of attachment of a muscle, or what the muscle moves.""",
        `@extends` = () => List(),
        `@range` = () => List(AnatomicalStructure.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}