package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object responsibilities extends PropertyDef(
        iri = "http://schema.org/responsibilities",
        iris = Set("http://schema.org/responsibilities"),
        label = "responsibilities",
        comment = """Responsibilities associated with this role or Occupation.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}