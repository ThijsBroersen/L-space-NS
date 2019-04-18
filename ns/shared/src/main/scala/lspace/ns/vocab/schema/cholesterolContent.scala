package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cholesterolContent extends PropertyDef(
        iri = "http://schema.org/cholesterolContent",
        iris = Set("http://schema.org/cholesterolContent"),
        label = "cholesterolContent",
        comment = """The number of milligrams of cholesterol.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}