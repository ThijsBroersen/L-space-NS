package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object drug extends PropertyDef(
        iri = "http://schema.org/drug",
        iris = Set("http://schema.org/drug"),
        label = "drug",
        comment = """Specifying a drug or medicine used in a medication procedure""",
        `@extends` = () => List(),
        `@range` = () => List(Drug.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}