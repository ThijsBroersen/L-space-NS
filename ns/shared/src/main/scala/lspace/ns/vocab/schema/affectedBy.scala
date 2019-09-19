package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object affectedBy extends PropertyDef(
        iri = "http://schema.org/affectedBy",
        iris = Set("http://schema.org/affectedBy"),
        label = "affectedBy",
        comment = """Drugs that affect the test's results.""",
        `@extends` = () => List(),
        `@range` = () => List(Drug.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}