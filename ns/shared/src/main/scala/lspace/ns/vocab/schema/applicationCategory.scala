package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object applicationCategory extends PropertyDef(
        iri = "http://schema.org/applicationCategory",
        iris = Set("http://schema.org/applicationCategory"),
        label = "applicationCategory",
        comment = """Type of software application, e.g. 'Game, Multimedia'.""",
        `@extends` = List(),
        `@range` = List(`@string`, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}