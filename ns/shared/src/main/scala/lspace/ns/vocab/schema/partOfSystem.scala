package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfSystem extends PropertyDef(
        iri = "http://schema.org/partOfSystem",
        iris = Set("http://schema.org/partOfSystem"),
        label = "partOfSystem",
        comment = """The anatomical or organ system that this structure is part of.""",
        `@extends` = List(),
        `@range` = List(AnatomicalSystem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}