package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfAxles extends PropertyDef(
        iri = "http://schema.org/numberOfAxles",
        iris = Set("http://schema.org/numberOfAxles"),
        label = "numberOfAxles",
        comment = """The number of axles.<br/><br/>

Typical unit code(s): C62""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology, Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}